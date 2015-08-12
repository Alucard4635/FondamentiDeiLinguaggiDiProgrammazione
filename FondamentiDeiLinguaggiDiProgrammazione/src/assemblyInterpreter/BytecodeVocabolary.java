package assemblyInterpreter;

import zAssemblerParr.BytecodeDefinition.Instruction;

public class BytecodeVocabolary {

	
	
	   public static class Instruction {
	        String name; // E.g., "iadd", "call"
	        int[] type = new int[1];
	        int n = 0;
	        public Instruction(String name) { this(name,0); n=0; }
	        public Instruction(String name, int a) {   this.name = name;
	            type[0] = a;
	            n = 1;
	        }
	    // INSTRUCTION BYTECODES
	      //System
	    	public static final short HALT = 0;
	    	public static final short PRINT = 1;
	    //Managing Variables
	    //Local
	    	public static final short LOAD = 5;
	    	public static final short STORE = 6;
	    //Global
	    	public static final short GLOAD = 7;
	    	public static final short GSTORE = 8;
	    //Function
	    	public static final short CALL = 11;
	    	public static final short RET = 12;
	    //Integer
	    	public static final short IADD = 21;
	    	public static final short ISUB = 22;
	    	public static final short IMUL = 23;
	    	public static final short ILT = 24;
	    	public static final short IEQ = 25;
	    //Float
	    	public static final short FADD = 31;
	    	public static final short FSUB = 32;
	    	public static final short FMUL = 33;
	    	public static final short FLT = 34;
	    	public static final short FEQ = 35;
	    //Conversion
	    	public static final short ITOF = 101;
	    //Add Constant To Operand's Stack
	    	public static final short ICONST = 151;//int
	    	public static final short SCONST = 152;//float
	    	public static final short FCONST = 153;//String
	    //Branch
	    	public static final short BR = 181;
	    	public static final short BRT = 182;
	    	public static final short BRF = 183;

	    /** Used for assembly/disassembly; describes instruction set */
	    public static Instruction[] instructions = new Instruction[] {
	        null, // <INVALID>
	        new Instruction("iadd"), // index is the opcode
	    };
	}
	
	
    public static int getInt(byte[] memory, int index) {
        int b1 = memory[index++]&0xFF; // mask off sign-extended bits
        int b2 = memory[index++]&0xFF;
        int b3 = memory[index++]&0xFF;
        int b4 = memory[index++]&0xFF;
        int word = b1<<(8*3) | b2<<(8*2) | b3<<(8*1) | b4;
        return word;
    }
    
    public static void writeInt(byte[] bytes, int index, int value) {
        bytes[index+0] = (byte)((value>>(8*3))&0xFF); // get highest byte
        bytes[index+1] = (byte)((value>>(8*2))&0xFF);
        bytes[index+2] = (byte)((value>>(8*1))&0xFF);
        bytes[index+3] = (byte)(value&0xFF);
    }
}
