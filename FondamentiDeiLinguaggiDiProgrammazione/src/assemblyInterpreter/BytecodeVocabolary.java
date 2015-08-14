package assemblyInterpreter;

import java.util.ArrayList;

public class BytecodeVocabolary {

	public static final int INT = 0, FLOAT = 1, LABEL = 2, STRING = 3;

	// INSTRUCTION BYTECODES
	public static final short
	// System
			HALT = 1,
			PRINT = 2,
			// Managing Variables
			// Local
			LOAD = 3, STORE = 4,
			// Global
			GLOAD = 5, GSTORE = 6,
			// Function
			CALL = 7, RET = 8,
			// Integer
			IADD = 9, ISUB = 10, IMUL = 11, ILT = 12, IEQ = 13,
			// Float
			FADD = 14, FSUB = 15, FMUL = 16, FLT = 17, FEQ = 18,
			// Conversion
			ITOF = 19,
			// Add Constant To Operand's Stack
			ICONST = 20, // int
			SCONST = 21, // float
			FCONST = 22, // String
			// Branch
			BR = 23, BRT = 24, BRF = 25;

	/** Used for assembly/disassembly; describes instruction set */
	public static final Instruction[] instructions = new Instruction[] {
			null, // <INVALID>
			new Instruction("halt"), new Instruction("print"),
			new Instruction("load", INT), new Instruction("store", INT),
			new Instruction("gload", INT), new Instruction("gstore", INT),
			new Instruction("call"), new Instruction("ret"),
			new Instruction("iadd"), new Instruction("isub"),
			new Instruction("imul"), new Instruction("ilt"),
			new Instruction("ieq"), new Instruction("fadd"),
			new Instruction("fsub"), new Instruction("fmul"),
			new Instruction("flt"), new Instruction("feq"),
			new Instruction("itof"), new Instruction("iconst"),
			new Instruction("sconst"), new Instruction("fconst"),
			new Instruction("br"), new Instruction("brt") // index is the opcode
	};

	public static int getInt(byte[] memory, int index) {
		int b1 = memory[index++] & 0xFF; // mask off sign-extended bits
		int b2 = memory[index++] & 0xFF;
		int b3 = memory[index++] & 0xFF;
		int b4 = memory[index++] & 0xFF;
		int word = b1 << (8 * 3) | b2 << (8 * 2) | b3 << (8 * 1) | b4;
		return word;
	}

	public static void writeInt(ArrayList<Byte> code, int value) {
		code.add(new Byte((byte) ((value >> (8 * 3)) & 0xFF))); // get highest
		code.add(new Byte((byte) ((value >> (8 * 2)) & 0xFF)));
		code.add(new Byte((byte) ((value >> (8 * 1)) & 0xFF)));
		code.add(new Byte((byte) (value & 0xFF)));
	}
}
