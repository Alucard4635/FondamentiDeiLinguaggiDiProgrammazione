package assemblyInterpreter;

import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import assemblerCompiler.BytecodeGenerator;
import assemblerGrammar.AssemblerGrammarLexer;
import assemblyInterpreter.InterpreterException.InterpreterExceptionType;

public class BytecodeProcessor {

	private static final int DEFAULT_OPERAND_STACK_SIZE = 1000;
	private static final int DEFAULT_CALL_STACK_SIZE = 1000;
	private int ip; // instruction pointer register
	private byte[] code; // byte-addressable code memory.
	private int codeSize;
	private Object[] globals; // global variable space
	private Object[] constPool;

	/** Operand stack, grows upwards */
	private Object[] operands = new Object[DEFAULT_OPERAND_STACK_SIZE];
	private int sp = -1; // stack pointer register

	/** Stack of stack frames, grows upwards */
	private FunctionRecord[] calls = new FunctionRecord[DEFAULT_CALL_STACK_SIZE];
	private int fp = -1; // Function pointer register
	private InterpreterFunction mainFunction;

	public BytecodeProcessor() {

	}

	public boolean loadAssemblerCode(InputStream input) throws Exception {
		boolean hasErrors = false;
		try {

			AssemblerGrammarLexer assemblerLexer = new AssemblerGrammarLexer(
					new ANTLRInputStream(input));
			CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
			BytecodeGenerator assembler = new BytecodeGenerator(tokens,
					BytecodeVocabolary.instructions);
			assembler.program();
			this.code = assembler.getMachineCode();
			this.codeSize = assembler.getCodeMemorySize();
			this.constPool = assembler.getConstantPool();
			this.mainFunction = assembler.getMainFunction();
			this.globals = new Object[assembler.getGlobalLength()];

			hasErrors = assembler.getNumberOfSyntaxErrors() > 0;
		} finally {
			input.close();
		}
		return hasErrors;
	}

	public void start() throws Exception {
		// SIMULATE "call main()"; set up stack as if we'd called main()
		if (mainFunction == null) {
			throw new InterpreterException(InterpreterExceptionType.NO_MAIN);
		}
		FunctionRecord f = new FunctionRecord(mainFunction, -1,0);
		calls[++fp] = f;
		ip = mainFunction.getDeclarationAddress();
		executeCode();
	}

	protected int getIntOperand() {
		int word = BytecodeVocabolary.getInt(code, ip);
		ip += 4;
		return word;
	}

	protected void call(int functionConstPoolIndex) throws InterpreterException {
		Object functionObject = constPool[functionConstPoolIndex];
		if (!(functionObject instanceof InterpreterFunction)) {
			throw new InterpreterException(InterpreterExceptionType.UNDEFINED, ip, functionObject.toString());
		}
		InterpreterFunction fs = (InterpreterFunction) functionObject;
		System.out.println("Call "+fs.getName()+" From "+ip+" new ip "+fs.getDeclarationAddress());//FIXME
		int argumentNumber = fs.getArgumentNumber();
		FunctionRecord f = new FunctionRecord(fs, ip, sp-argumentNumber);
		calls[++fp] = f; // push new function record for parameters and locals
		ip = fs.getDeclarationAddress(); // branch to function
		sp=argumentNumber-1;

	}
	/*	Object[] arguments = getArguments(argumentNumber);
		
		Object[] stackContent = getContent(argumentNumber);
		
		setOnStack(arguments);//set only arguments on stack
		
		FunctionRecord f = new FunctionRecord(fs, ip, stackContent,sp);*/

	/*private void setOnStack(Object[] arguments) {
		for (int a = sp; a >= 0; a--) {
			operands[a]=null;
			if(a<=arguments.length){
				operands[a]=arguments[a];
			}
		}
	}

	private Object[] getContent(int argumentNumber) {
		Object[] stackContent = new Object[sp+1-argumentNumber];//copy stack content
		for (int a = sp-argumentNumber; a >= 0; a--) {
			stackContent[a] = operands[a];
		}
		return stackContent;
	}

	private Object[] getArguments(int argumentNumber) {
		Object[] arguments = new Object[argumentNumber];//copy stack's argument content
		for (int a = argumentNumber-1; a >= 0; a--) {
			arguments[a] = operands[sp+a-argumentNumber];
		}
		return arguments;
	}*/

	/** Simulate the fetch-execute cycle 
	 * @throws InterpreterException */
	protected void executeCode() throws InterpreterException {
		int opI1, opI2;
		float opF1, opF2;
		int addressArgoment = 0;
		short opcode = code[ip];
		while (opcode != BytecodeVocabolary.HALT && ip < codeSize) {

			ip++; // jump to next instruction or first byte of operand
			switch (opcode) {
			case BytecodeVocabolary.IADD:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 + opI2; 
				break;
			case BytecodeVocabolary.ISUB:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 - opI2;
				break;
			case BytecodeVocabolary.IMUL:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 * opI2;
				break;
			case BytecodeVocabolary.ILT:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 < opI2;
				break;
			case BytecodeVocabolary.IGT:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 > opI2;
				break;
			case BytecodeVocabolary.IEQ:
				opI2 = (Integer) popOperand(); 
				opI1 = (Integer) topOperand();
				operands[sp] = opI1 == opI2;
				break;
			case BytecodeVocabolary.FADD:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 + opF2;
				break;
			case BytecodeVocabolary.FSUB:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 - opF2;
				break;
			case BytecodeVocabolary.FMUL:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 * opF2;
				break;
			case BytecodeVocabolary.FLT:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 < opF2;
				break;
			case BytecodeVocabolary.FGT:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 < opF2;
				break;
			case BytecodeVocabolary.FEQ:
				opF2 = (Float) popOperand(); 
				opF1 = (Float) topOperand();
				operands[sp] = opF1 == opF2;
				break;
			case BytecodeVocabolary.ITOF:
				opI1 = (Integer) popOperand();
				operands[++sp] = (float) opI1;
				break;
			case BytecodeVocabolary.CALL:
				int funcIndexInConstPool = getIntOperand();
				call(funcIndexInConstPool);
				break;
			case BytecodeVocabolary.RET: 
				returnFromCall();
				break;
			case BytecodeVocabolary.BR:
				ip = getIntOperand();
				break;
			case BytecodeVocabolary.BRT:
				addressArgoment = getIntOperand();
				if (popOperand().equals(true))
					ip = addressArgoment;
				break;
			case BytecodeVocabolary.BRF:
				addressArgoment = getIntOperand();
				if (popOperand().equals(false))
					ip = addressArgoment;
				break;
			case BytecodeVocabolary.ICONST:
				pushOperand(getIntOperand()); // push operand
				break;
			case BytecodeVocabolary.FCONST:
			case BytecodeVocabolary.SCONST:
				int constPoolIndex = getIntOperand();
				pushOperand(constPool[constPoolIndex]);
				break;
			case BytecodeVocabolary.LOAD: // load from local stack
				addressArgoment = getIntOperand();
				pushOperand(calls[fp].getLocalsVariables()[addressArgoment]);
				break;
			case BytecodeVocabolary.GLOAD:// load from global memory
				addressArgoment = getIntOperand();
				pushOperand(globals[addressArgoment]);
				break;
			case BytecodeVocabolary.STORE:
				addressArgoment = getIntOperand();
				calls[fp].getLocalsVariables()[addressArgoment] = popOperand();
				break;
			case BytecodeVocabolary.GSTORE:
				addressArgoment = getIntOperand();
				globals[addressArgoment] = popOperand();
				break;
			case BytecodeVocabolary.PRINT:
				System.out.println(popOperand());
				break;
			default:
				throw new InterpreterException(InterpreterExceptionType.UNKNOWN_INSTRUCTION,ip,new Short(opcode).toString()) ; 
			}
			opcode = code[ip];
		}

	}

	private void returnFromCall() {
		FunctionRecord fr = calls[fp--];
		System.out.println("returningFrom "+fr.getFunction().getName()+" new ip "+fr.getReturnAddress());//FIXME
		ip = fr.getReturnAddress(); 
	}


	private void pushOperand(Object op) throws InterpreterException {
		try {
			operands[++sp] = op;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InterpreterException(InterpreterExceptionType.OUT_OF_MEMORY, ip, "Adding Operand");
		}
	}

	private Object topOperand() throws InterpreterException {
		try {
			return operands[sp];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InterpreterException(InterpreterExceptionType.NO_ELEMENT_ON_STACK, ip, "Look on top");
		}
	}

	private Object popOperand() throws InterpreterException {
		try {
			if(sp<calls[fp].getSp()){
				throw new InterpreterException(InterpreterExceptionType.UNACCESSIBILE_STACK_ELEMENT, ip, "Pop On Stack");//TODO deassembly operand for cause
			}
			return operands[sp--];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new InterpreterException(InterpreterExceptionType.NO_ELEMENT_ON_STACK, ip, "Pop On Stack");
		}
	}
}
