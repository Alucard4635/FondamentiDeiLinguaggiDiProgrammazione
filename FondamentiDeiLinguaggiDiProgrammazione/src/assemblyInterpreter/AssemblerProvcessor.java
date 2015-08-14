package assemblyInterpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import assemblerCompirer.BytecodeGenerator;
import assemblerGrammar.AssemblerGrammarLexer;

public class AssemblerProvcessor {

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
	private AssemblyFunction mainFunction;

	public AssemblerProvcessor() {

	}

	public static void main(String[] args) throws Exception {
		String filename = null;
		/*
		 * boolean trace = false; // PROCESS ARGS boolean disassemble = false;
		 * boolean dump = false; int i = 0; while ( i<args.length ) { if (
		 * args[i].equals("-trace") ) { trace = true; i++; } else if (
		 * args[i].equals("-dis") ) { disassemble = true; i++; } else if (
		 * args[i].equals("-dump") ) { dump = true; i++; } else { filename =
		 * args[i]; i++; } }
		 */
		if (args.length > 0) {
			filename = args[0];
		}
		InputStream input = null;
		if (filename != null)
			input = new FileInputStream(filename);
		else {
			JFileChooser fc = new JFileChooser(new File(".").getCanonicalPath());
			fc.setMultiSelectionEnabled(false);
			int responce = fc.showOpenDialog(null);
			if (responce == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fc.getSelectedFile();
				input = new FileInputStream(selectedFile);

			} else if (responce == JFileChooser.ERROR_OPTION) {
				System.out.println("error while opening JFileChooser");
				System.out.println("Enter File Name: ");
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(System.in));
				filename = bufferedReader.readLine();
				input = new FileInputStream(filename);
			} else {
				System.exit(0);
			}

		}

		AssemblerProvcessor interpreter = new AssemblerProvcessor();
		interpreter.load(input);
		interpreter.exec();
	}

	public boolean load(InputStream input) throws Exception {
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
			this.globals = new Object[assembler.getDataSize()];

			hasErrors = assembler.getNumberOfSyntaxErrors() > 0;
		} finally {
			input.close();
		}
		return hasErrors;
	}

	public void exec() throws Exception {
		// SIMULATE "call main()"; set up stack as if we'd called main()
		if (mainFunction == null) {
			mainFunction = new AssemblyFunction("main", 0, 0, 0);
		}
		FunctionRecord f = new FunctionRecord(mainFunction, -1);
		calls[++fp] = f;
		ip = mainFunction.getDeclarationAddress();
		executeCode();
	}

	protected int getIntOperand() {
		int word = BytecodeVocabolary.getInt(code, ip);
		ip += 4;
		return word;
	}

	protected void call(int functionConstPoolIndex) {
		AssemblyFunction fs = (AssemblyFunction) constPool[functionConstPoolIndex];
		FunctionRecord f = new FunctionRecord(fs, ip);
		calls[++fp] = f; // push new stack frame for parameters and locals
		// move args from operand stack to top frame on call stack
		for (int a = fs.getArgumentNumber() - 1; a >= 0; a--) {
			f.getLocalsVariables()[a] = popOperand();
		}
		ip = fs.getDeclarationAddress(); // branch to function
	}

	/** Simulate the fetch-execute cycle */
	protected void executeCode() {
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
				FunctionRecord fr = calls[fp--]; 
				ip = fr.getReturnAddress(); 
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
			case BytecodeVocabolary.LOAD: // load from call stack
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
				throw new Error("invalid opcode: " + opcode + " at ip="
						+ (ip - 1));
			}
			opcode = code[ip];
		}

	}

	private void pushOperand(Object op) {
		operands[++sp] = op;
	}

	private Object topOperand() {
		return operands[sp];
	}

	private Object popOperand() {
		return operands[sp--];
	}
}
