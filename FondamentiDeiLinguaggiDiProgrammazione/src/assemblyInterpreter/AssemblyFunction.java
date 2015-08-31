package assemblyInterpreter;

public class AssemblyFunction {
	private String name;
	private int argumentNumber;
	private int localVariablesNumber;
	private int declarationAddress;
	public AssemblyFunction(String id,int nArg,int nLocals, int address){
		name = id;
		argumentNumber = nArg;
		localVariablesNumber = nLocals;
		declarationAddress = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArgumentNumber() {
		return argumentNumber;
	}
	public void setArgumentNumber(int argumentNumber) {
		this.argumentNumber = argumentNumber;
	}
	public int getLocalVariablesNumber() {
		return localVariablesNumber;
	}
	public void setLocalVariablesNumber(int localVariablesNumber) {
		this.localVariablesNumber = localVariablesNumber;
	}
	public int getDeclarationAddress() {
		return declarationAddress;
	}
	public void setDeclarationAddress(int declarationAddress) {
		this.declarationAddress = declarationAddress;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AssemblyFunction){
			AssemblyFunction f=(AssemblyFunction) obj;
			return name.equals(f.name)
					&& localVariablesNumber==f.localVariablesNumber
					&& argumentNumber==f.argumentNumber;
		}
		return super.equals(obj);
	}
}
