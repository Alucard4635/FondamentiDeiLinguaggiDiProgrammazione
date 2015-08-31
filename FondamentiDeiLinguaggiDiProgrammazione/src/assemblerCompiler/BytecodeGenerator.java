package assemblerCompiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import assemblerCompiler.AssemblerException.AssemblerExceptionType;
import assemblerGrammar.AssemblerGrammarParser;
import assemblyInterpreter.AssemblyFunction;
import assemblyInterpreter.BytecodeVocabolary;
import assemblyInterpreter.Instruction;

public class BytecodeGenerator extends AssemblerGrammarParser {
	private static final boolean DEBUG=true;
	private static final int INITIAL_CODE_SIZE = 2048;
	protected Map<String, Integer> instructionOpcodeMapping = new HashMap<String, Integer>();
	protected Map<String, Tag> labels = new HashMap<String, Tag>();// label
																					// scope
	/**
	 * All float and string literals have unique int index in constant pool. We
	 * put AssemblyFunction in here too.
	 */
	private ArrayList<Object> constPool = new ArrayList<Object>();
	private ArrayList<Byte> code = new ArrayList<Byte>(INITIAL_CODE_SIZE); // code
																			// memory
	private int globalLength; // set via .globals
	private AssemblyFunction mainFunction;

	public BytecodeGenerator(TokenStream input) {
		super(input);
		Instruction[] allInstructions = BytecodeVocabolary.instructions;
		for (int i = 1; i < allInstructions.length; i++) {
			instructionOpcodeMapping.put(allInstructions[i].getNameLowerCase(),
					i);
		}
	}

	public BytecodeGenerator(TokenStream lexer, Instruction[] instructions) {
		super(lexer);
		for (int i = 1; i < instructions.length; i++) {
			instructionOpcodeMapping.put(instructions[i].getNameLowerCase(), i);
		}
	}

	public byte[] getMachineCode() {
		byte[] newCode = new byte[code.size()];
		int i = 0;
		for (Byte byte1 : code) {
			newCode[i++] = byte1.byteValue();
		}
		return newCode;
	}

	public int getCodeMemorySize() {
		return code.size();
	}

	public int getGlobalLength() {
		return globalLength;
	}
	@Override
	protected void setGlobalLength(int n) {
		globalLength = n;
	}

	@Override
	protected void generateInstruction(Token instrToken) {
		if (DEBUG) {
			System.out.println("genereting instruction: "+instrToken);
		}
		String instrName = instrToken.getText();
		Integer opcodeI = instructionOpcodeMapping.get(instrName);
		if (opcodeI == null) {
			throw new AssemblerException(AssemblerException.AssemblerExceptionType.UNKNOWN_INSTRUCTION,instrToken.getLine(),instrName);
		}
		code.add((byte) opcodeI.byteValue());
	}

	/** Generate code for an instruction with one operand */
	@Override
	protected void generateInstruction(Token instrToken, Token operandToken) {
		generateInstruction(instrToken);
		generateOperand(operandToken);
	}
	

	protected void generateOperand(Token operandToken) {
		String text = operandToken.getText();
		int value = 0;
		switch (operandToken.getType()) { // switch on token type
		case INT:
			value = Integer.valueOf(text);
			break;
		case FLOAT:
			value = getIndexOrAdd(Float.valueOf(text));
			break;
		case STRING:
			value = getIndexOrAdd(text);
			break;
		case ID:
			value = getLabelAddress(text);
			break;
		case FUNC:
			value = getFunctionIndex(text);
			break;
		}
		if (DEBUG) {
			System.out.println("genereting operand: "+operandToken+" and is "+value);
		}
		BytecodeVocabolary.writeInt(code, value); // write operand to code byte
	}

	protected void checkForUnresolvedReferences() {
		if (DEBUG) {
			System.out.println("checkForUnresolvedReferences");
		}
		for (String name : labels.keySet()) {
			Tag sym = (Tag) labels.get(name);
			if (!sym.isDefined()) {
				throw new AssemblerException(AssemblerException.AssemblerExceptionType.UNDEFINED,sym.whereIs,sym.name);
			}
		}
	}

	protected void defineFunction(Token idToken, int args, int locals) {
		if (DEBUG) {
			System.out.println("defineFunction: "+idToken+" A"+args+" L"+locals);
		}
		String name = idToken.getText();
		AssemblyFunction f = new AssemblyFunction(name, args, locals,
				code.size());
		int index=getIndexOrAdd(f);
		if (index<constPool.size()-1){
			if (DEBUG) {
				System.out.println("Found "+name+" at costant pool index "+index+ " already declared ");
			}
			throw new AssemblerException(AssemblerExceptionType.AlRADY_DEFINED, idToken.getLine(), f.getName());
		}
		resolveFunctionReference(f);
		if (name.equals("main")){
			if (DEBUG) {
				System.out.println("Set Main Function");
			}
			setMainFunction(f);
		}
	}

	private void resolveFunctionReference(AssemblyFunction f) {
		String functionReference;
		Object object;
		for (int i = 0; i < constPool.size(); i++) {
			object = constPool.get(i);
			if (object instanceof String) {
				functionReference = (String) object;
				if (functionReference.equals(f.getName()+"()")) {
					if (DEBUG) {
						System.out.println("Found reference: "+functionReference+" replacing");
					}
					constPool.set(i, f);
				}
			}
		}
	}

	protected int getIndexOrAdd(Object o) {
		int indexOf = constPool.indexOf(o);
		if (indexOf>0) {
			return indexOf;
		}
		constPool.add(o);
		return constPool.size() - 1;
	}

	public Object[] getConstantPool() {
		return constPool.toArray();
	}

	protected int getFunctionIndex(String id) {
		int i = constPool.indexOf(id);
		if (i >= 0){
			return i;
		}
		return getIndexOrAdd(id);
	}
	protected int getLabelAddress(String label) {
		if (DEBUG) {
			System.out.println("getAddress: "+label);
		}
		
		Tag symbol = (Tag) labels.get(label);
		if (symbol == null) {
			symbol = new Tag(label, code.size());
			labels.put(label, symbol); 
			symbol.addForwardReference(code.size());
		} else {
			if (!symbol.isDefined()) {
				symbol.addForwardReference(code.size());//last byte of operation, before address
			} else {
				return symbol.whereIs;
			}
		}
		if (DEBUG) {
			System.out.println("not Found: "+label+" placing -1 at "+ code.size());
		}
		return -1; 
	}
	
	@Override
    protected void defineAddressLabel(Token idToken) {
		if (DEBUG) {
			System.out.println("defining Label: "+idToken);
		}
        String label = idToken.getText();
        Tag foundTag = (Tag)labels.get(label);
        if ( foundTag==null ) {
            Tag newTag = new Tag(label, code.size());
            newTag.setDefinitionAddress(code.size());
            labels.put(label, newTag); 
        }
        else {
            if (foundTag.isForwardRefered()) {
            	foundTag.setDefinitionAddress(code.size());
                resolveReference(foundTag.getForwardReferedAddress(),foundTag.getDefinitionAddress());
            }
            else {
            	throw new AssemblerException(AssemblerException.AssemblerExceptionType.AlRADY_DEFINED,foundTag.whereIs,foundTag.name);
            }
        }
    }

	private void resolveReference(LinkedList<Integer> forwardReferedAddress,
			int definitionAddress) {
		if (DEBUG) {
			System.out.println("resolving Reference: ");
		}
		Integer poppedAddress;
		while (!forwardReferedAddress.isEmpty()) {
			poppedAddress = forwardReferedAddress.pop();
			if (DEBUG) {
				System.out.println("resolving Reference at: "+poppedAddress);
				System.out.println("repleasing byte: "+code.get(poppedAddress)+code.get(poppedAddress+1)+code.get(poppedAddress+2)+code.get(poppedAddress+3));
			}
			Byte byteToSet = (new Byte((byte) ((definitionAddress >> (8 * 3)) & 0xFF))); //first byte
			code.set(poppedAddress++, byteToSet);
			
			byteToSet = new Byte((byte) ((definitionAddress >> (8 * 2)) & 0xFF));//second one
			code.set(poppedAddress++, byteToSet);

			byteToSet = new Byte((byte) ((definitionAddress >> (8 * 1)) & 0xFF));
			code.set(poppedAddress++, byteToSet);

			byteToSet = new Byte((byte) (definitionAddress & 0xFF));
			code.set(poppedAddress, byteToSet);

			
		}
	}

	public AssemblyFunction getMainFunction() {
		return mainFunction;
	}

	public void setMainFunction(AssemblyFunction main) {
		mainFunction = main;
	}
	public static int getInt(byte[] memory, int index) {
        int b1 = memory[index++]&0xFF; // mask off sign-extended bits
        int b2 = memory[index++]&0xFF;
        int b3 = memory[index++]&0xFF;
        int b4 = memory[index++]&0xFF;
        int word = b1<<(8*3) | b2<<(8*2) | b3<<(8*1) | b4;
        return word;
    }
}
