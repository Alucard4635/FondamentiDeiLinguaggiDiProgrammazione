package assemblyInterpreter;

import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import zAssemblerParr.BytecodeAssembler;
import zAssemblerParr.BytecodeDefinition;
import zInterpreterParr.Interpreter;


public class AssemblerProvcessor {
	

    private static final int DEFAULT_OPERAND_STACK_SIZE = 1000;
	private static final int DEFAULT_CALL_STACK_SIZE = 1000;
	int ip;             // instruction pointer register
    byte[] code;        // byte-addressable code memory.
    int codeSize;
    Object[] globals;   // global variable space
    protected Object[] constPool;
	
    /** Operand stack, grows upwards */
    Object[] operands = new Object[DEFAULT_OPERAND_STACK_SIZE];
    int sp = -1;        // stack pointer register
	
    /** Stack of stack frames, grows upwards */
    FunctionRecord[] calls = new FunctionRecord[DEFAULT_CALL_STACK_SIZE];
    int fp = -1;        // frame pointer register
    AssemblyFunction mainFunction;    
	
	public AssemblerProvcessor() {
		// TODO Auto-generated constructor stub
	}
	
	 /*public boolean load(Interpreter interp, InputStream input) throws Exception {
	        boolean hasErrors = false;
	        try {
	            AssemblerLexer assemblerLexer =
	                new AssemblerLexer(new ANTLRInputStream(input));
	            CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
	            BytecodeAssembler assembler =
	                new BytecodeAssembler(tokens, BytecodeDefinition.instructions);
	            assembler.program();
	            interp.code = assembler.getMachineCode();
	            interp.codeSize = assembler.getCodeMemorySize();
	            interp.constPool = assembler.getConstantPool();
	            interp.mainFunction = assembler.getMainFunction();
	            interp.globals = new Object[assembler.getDataSize()];
	            interp.disasm = new DisAssembler(interp.code,
	                                             interp.codeSize,
	                                             interp.constPool);
	            hasErrors = assembler.getNumberOfSyntaxErrors()>0;
	        }
	        finally {
	            input.close();
	        }
	        return hasErrors;
	    }*/
	 
	    protected int getIntOperand() {
	        int word = BytecodeVocabolary.getInt(code, ip);
	        ip += 4;
	        return word;
	    }
	    
	    protected void call(int functionConstPoolIndex) {
	    	AssemblyFunction fs = (AssemblyFunction)constPool[functionConstPoolIndex];
	        FunctionRecord f = new FunctionRecord(fs, ip);
	        calls[++fp] = f; // push new stack frame for parameters and locals
	        // move args from operand stack to top frame on call stack
	        for (int a=fs.getArgumentNumber()-1; a>=0; a--) { 
	        	f.getLocalsVariables()[a] = operands[sp--]; 
	        	}
	        ip = fs.getDeclarationAddress(); // branch to function
	    }
	
    /** Simulate the fetch-execute cycle */
    protected void cpu() {
        int opI1,opI2;
        float opF1,opF2;
        int addressArgoment = 0;
        short opcode = code[ip];
        while (opcode!= BytecodeVocabolary.HALT && ip < codeSize) {
            
            ip++; //jump to next instruction or first byte of operand
            switch (opcode) {
                case BytecodeVocabolary.IADD :
                    opI1 = (Integer)operands[sp-1]; // 1st opnd 1 below top
                    opI2 = (Integer)operands[sp];   // 2nd opnd at top of stack
                    sp -= 2;                     // pop both operands
                    operands[++sp] = opI1 + opI2;      // push result
                    break;
                case BytecodeVocabolary.ISUB :
                    opI1 = (Integer)operands[sp-1];
                    opI2 = (Integer)operands[sp];
                    sp -= 2;
                    operands[++sp] = opI1 - opI2;
                    break;
                case BytecodeVocabolary.IMUL:
                    opI1 = (Integer)operands[sp-1];
                    opI2 = (Integer)operands[sp];
                    sp -= 2;
                    operands[++sp] = opI1 * opI2;
                    break;
                case BytecodeVocabolary.ILT :
                    opI1 = (Integer)operands[sp-1];
                    opI2 = (Integer)operands[sp];
                    sp -= 2;
                    operands[++sp] = opI1 < opI2;
                    break;
                case BytecodeVocabolary.IEQ :
                    opI1 = (Integer)operands[sp-1];
                    opI2 = (Integer)operands[sp];
                    sp -= 2;
                    operands[++sp] = opI1 == opI2;
                    break;
                case BytecodeVocabolary.FADD :
                    opF1 = (Float)operands[sp-1];
                    opF2 = (Float)operands[sp];
                    sp -= 2;
                    operands[++sp] = opF1 + opF2;
                    break;
                case BytecodeVocabolary.FSUB :
                    opF1 = (Float)operands[sp-1];
                    opF2 = (Float)operands[sp];
                    sp -= 2;
                    operands[++sp] = opF1 - opF2;
                    break;
                case BytecodeVocabolary.FMUL:
                    opF1 = (Float)operands[sp-1];
                    opF2 = (Float)operands[sp];
                    sp -= 2;
                    operands[++sp] = opF1 * opF2;
                    break;
                case BytecodeVocabolary.FLT :
                    opF1 = (Float)operands[sp-1];
                    opF2 = (Float)operands[sp];
                    sp -= 2;
                    operands[++sp] = opF1 < opF2;
                    break;
                case BytecodeVocabolary.FEQ :
                    opF1 = (Float)operands[sp-1];
                    opF2 = (Float)operands[sp];
                    sp -= 2;
                    operands[++sp] = opF1 == opF2;
                    break;
                case BytecodeVocabolary.ITOF :
                    opI1 = (Integer)operands[sp--];
                    operands[++sp] = (float)opI1;
                    break;
                case BytecodeVocabolary.CALL :
                    int funcIndexInConstPool = getIntOperand();
                    call(funcIndexInConstPool);
                    break;
                case BytecodeVocabolary.RET : // result is on op stack
                    FunctionRecord fr = calls[fp--];    // pop stack frame
                    ip = fr.getReturnAddress();          // branch to ret addr
                    break;
                case BytecodeVocabolary.BR :
                    ip = getIntOperand();
                    break;
                case BytecodeVocabolary.BRT :
                    addressArgoment = getIntOperand();
                    if ( operands[sp--].equals(true) ) ip = addressArgoment;
                    break;
                case BytecodeVocabolary.BRF :
                    addressArgoment = getIntOperand();
                    if ( operands[sp--].equals(false) ) ip = addressArgoment;
                    break;
                case BytecodeVocabolary.ICONST :
                    operands[++sp] = getIntOperand(); // push operand
                    break;
                case BytecodeVocabolary.FCONST :
                case BytecodeVocabolary.SCONST :
                    int constPoolIndex = getIntOperand();
                    operands[++sp] = constPool[constPoolIndex];
                    break;
                case BytecodeVocabolary.LOAD : // load from call stack
                    addressArgoment = getIntOperand();
                    operands[++sp] = calls[fp].getLocalsVariables()[addressArgoment];
                    break;
                case BytecodeVocabolary.GLOAD :// load from global memory
                    addressArgoment = getIntOperand();
                    operands[++sp] = globals[addressArgoment];
                    break;
                case BytecodeVocabolary.STORE :
                    addressArgoment = getIntOperand();
                    calls[fp].getLocalsVariables()[addressArgoment] = operands[sp--];
                    break;
                case BytecodeVocabolary.GSTORE :
                    addressArgoment = getIntOperand();
                    globals[addressArgoment] = operands[sp--];
                    break;
                case BytecodeVocabolary.PRINT :
                    System.out.println(operands[sp--]);
                    break;
                default :
                    throw new Error("invalid opcode: "+opcode+" at ip="+(ip-1));
            }
            opcode = code[ip];
        }
        
    }
}
