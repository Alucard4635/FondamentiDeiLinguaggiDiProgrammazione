package assemblerCompirer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import assemblerGrammar.AssemblerGrammarParser;
import assemblyInterpreter.AssemblyFunction;
import assemblyInterpreter.BytecodeVocabolary;
import assemblyInterpreter.Instruction;

public class BytecodeGenerator extends AssemblerGrammarParser {

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
	private int dataSize; // set via .globals
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

	public int getDataSize() {
		return dataSize;
	}

	protected void defineDataSize(int n) {
		dataSize = n;
	}


	protected void gen(Token instrToken) {
		String instrName = instrToken.getText();
		Integer opcodeI = instructionOpcodeMapping.get(instrName);
		if (opcodeI == null) {
			throw new AssemblerException(AssemblerException.AssemblerExceptionType.UNKNOWN_INSTRUCTION,instrToken.getLine(),instrName);
		}
		code.add((byte) opcodeI.byteValue());
	}

	/** Generate code for an instruction with one operand */
	protected void gen(Token instrToken, Token operandToken) {
		gen(instrToken);
		genOperand(operandToken);
	}

	protected void genOperand(Token operandToken) {
		String text = operandToken.getText();
		int v = 0;
		switch (operandToken.getType()) { // switch on token type
		case INT:
			v = Integer.valueOf(text);
			break;
		case FLOAT:
			v = getConstantPoolIndex(Float.valueOf(text));
			break;
		case STRING:
			v = getConstantPoolIndex(text);
			break;
		case ID:
			v = getLabelAddress(text);
			break;
		case FUNC:
			v = getFunctionIndex(text);
			break;
		}
		BytecodeVocabolary.writeInt(code, v); // write operand to code byte
	}

	protected void checkForUnresolvedReferences() {//TODO devo farlo io
		for (String name : labels.keySet()) {
			Tag sym = (Tag) labels.get(name);
			if (!sym.isDefined()) {
				throw new AssemblerException(AssemblerException.AssemblerExceptionType.UNDEFINED,sym.getWhereIs(),sym.name);
			}
		}
	}

	protected void defineFunction(Token idToken, int args, int locals) {
		String name = idToken.getText();
		AssemblyFunction f = new AssemblyFunction(name, args, locals,
				code.size());
		if (name.equals("main"))
			setMainFunction(f);
		if (constPool.contains(f))
			constPool.set(constPool.indexOf(f), f);
		else
			getConstantPoolIndex(f);
	}

	protected int getConstantPoolIndex(Object o) {
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
		return getConstantPoolIndex(id);
	}

	protected int getLabelAddress(String id) {
		Tag sym = (Tag) labels.get(id);
		if (sym == null) {
			sym = new Tag(id, code.size());
			labels.put(id, sym); 
		} else {
			if (sym.isForwardRefered()) {
				sym.addForwardReference(code.size());
			} else {
				return sym.getWhereIs();
			}
		}
		return 0; 
	}
	
	@Override
    protected void defineAddressLabel(Token idToken) {//TODO devo farla io
        String id = idToken.getText();
        Tag sym = (Tag)labels.get(id);
        if ( sym==null ) { 
            Tag csym = new Tag(id, code.size());
            labels.put(id, csym); // add to symbol table
        }
        else {
            if (sym.isForwardRefered()) {//TODO ho modificato giusto?
                sym.setDefined(true);
                sym.setAddress(code.size());
                sym.addForwardReference(code.size());
            }
            else {
                // redefinition of symbol
                System.err.println("line "+idToken.getLine()+
                        ": redefinition of symbol "+id);
            }
        }
    }

	public AssemblyFunction getMainFunction() {
		return mainFunction;
	}

	public void setMainFunction(AssemblyFunction mainFunction) {
		this.mainFunction = mainFunction;
	}
}
