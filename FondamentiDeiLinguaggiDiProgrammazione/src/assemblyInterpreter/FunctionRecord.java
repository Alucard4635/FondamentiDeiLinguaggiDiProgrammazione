package assemblyInterpreter;

public class FunctionRecord {
	private AssemblyFunction function; 
    private int returnAddress;  
    private Object[] localsVariables; 
    
    public FunctionRecord(AssemblyFunction f, int returnAddress) {
        function = f;
        this.returnAddress = returnAddress;
        localsVariables = new Object[f.getArgumentNumber()+f.getLocalVariablesNumber()];
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
}
