package assemblyInterpreter;

public class FunctionRecord {
	private AssemblyFunction function;
	private int returnAddress;
	private Object[] localsVariables;
	// private Object[] returnOperand;
	private int sp;

	/*
	 * public FunctionRecord(AssemblyFunction f, int returnAddress, Object[]
	 * returnOperand, int sp) { function = f; this.returnAddress =
	 * returnAddress; this.sp = sp; this.setReturnOperand(returnOperand);
	 * localsVariables = new Object[f.getLocalVariablesNumber()]; }
	 */

	public FunctionRecord(AssemblyFunction fs, int ip, int stackLimitMin) {
		function = fs;
		this.returnAddress = ip;
		this.sp = stackLimitMin;
		localsVariables = new Object[fs.getLocalVariablesNumber()];
	}

	public AssemblyFunction getFunction() {
		return function;
	}

	public void setFunction(AssemblyFunction function) {
		this.function = function;
	}

	public int getReturnAddress() {
		return returnAddress;
	}

	public void setReturnAddress(int returnAddress) {
		this.returnAddress = returnAddress;
	}

	public Object[] getLocalsVariables() {
		return localsVariables;
	}

	public void setLocalsVariables(Object[] localsVariables) {
		this.localsVariables = localsVariables;
	}

	/*public Object[] getReturnOperand() {
		return returnOperand;
	}

	public void setReturnOperand(Object[] returnOperand) {
		this.returnOperand = returnOperand;
	}*/

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

}
