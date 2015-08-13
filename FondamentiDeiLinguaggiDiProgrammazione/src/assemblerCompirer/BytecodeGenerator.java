package assemblerCompirer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import assemblerAntlr.AssemblerParser;
import assemblyInterpreter.AssemblyFunction;
import assemblyInterpreter.BytecodeVocabolary;
import assemblyInterpreter.Instruction;

public class BytecodeGenerator extends AssemblerParser {
	public BytecodeGenerator(TokenStream input) {
		super(input);
		Instruction[] allInstructions = BytecodeVocabolary.instructions;
		for (int i = 1; i < allInstructions.length; i++) {
			instructionOpcodeMapping.put(allInstructions[i].getNameLowerCase(), i);
		}
		// TODO Auto-generated constructor stub
	}

	private static final int INITIAL_CODE_SIZE = 2048;
	protected Map<String, Integer> instructionOpcodeMapping = new HashMap<String, Integer>();
	protected Map<String, LabelSymbol> labels = new HashMap<String, LabelSymbol>();// label
																					// scope
	/**
	 * All float and string literals have unique int index in constant pool. We
	 * put FunctionSymbols in here too.
	 */
	protected List<Object> constPool = new ArrayList<Object>();
	protected int ip = 0; // Instruction pointer; used to fill code[]
	protected ArrayList<Byte> code = new ArrayList<Byte>(INITIAL_CODE_SIZE); // code
																				// memory
	protected int dataSize; // set via .globals
	protected AssemblyFunction mainFunction;
	
   protected void gen(Token instrToken) {
        String instrName = instrToken.getText();
        Integer opcodeI = instructionOpcodeMapping.get(instrName);
        if ( opcodeI==null ) {
            System.err.println("line "+instrToken.getLine()+
                               ": Unknown instruction: "+instrName);
            return;
        }
        int opcode = opcodeI.intValue();
        code.add((byte)(opcode&0xFF));
    }

    /** Generate code for an instruction with one operand */
    protected void gen(Token instrToken, Token operandToken) {
        gen(instrToken);
        genOperand(operandToken);
    }
    
    protected void genOperand(Token operandToken) {//TODO devo mettere un byte alla volta
        String text = operandToken.getText();
        int v = 0;
        switch ( operandToken.getType() ) { // switch on token type
            case INT :   v = Integer.valueOf(text); break;
            case FLOAT : v = getConstantPoolIndex(Float.valueOf(text)); break;
            case STRING: v = getConstantPoolIndex(text); break;
            case ID :    v = getLabelAddress(text); break;
            case FUNC :  v = getFunctionIndex(text); break;
        }
        BytecodeVocabolary.writeInt(code, ip, v); // write operand to code byte array
        ip += 4;               // we've written four bytes
    }
    protected int getConstantPoolIndex(Object o) {
        if ( constPool.contains(o) ) 
        	return constPool.indexOf(o);
        constPool.add(o);
        return constPool.size()-1;
    }

    public Object[] getConstantPool() { 
    	return constPool.toArray(); 
    	}
    protected int getFunctionIndex(String id) {//TODO remove object creation
        int i = constPool.indexOf(new AssemblyFunction(id));
        if ( i>=0 ) return i; // already in system; return index.
        // must be a forward function reference
        // create the constant pool entry; we'll fill in later
        return getConstantPoolIndex(new AssemblyFunction(id));
    }
    protected int getLabelAddress(String id) {//TODO look forward reference
        LabelSymbol sym = (LabelSymbol) labels.get(id);
        if ( sym==null ) {
            // assume it's a forward code reference; record opnd address
            sym = new LabelSymbol(id, ip, true);
            sym.isDefined = false;
            labels.put(id, sym); // add to symbol table
        }
        else {
            if ( sym.isForwardRef ) {
                // address is unknown, must simply add to forward ref list
                // record where in code memory we should patch later
                sym.addForwardReference(ip);
            }
            else {
                // all is well; it's defined--just grab address
                return sym.address;
            }
        }
        return 0; // we don't know the real address yet
    }

    
}
