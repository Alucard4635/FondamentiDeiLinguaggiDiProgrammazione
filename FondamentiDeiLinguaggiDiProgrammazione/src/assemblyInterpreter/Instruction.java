package assemblyInterpreter;

public class Instruction {
	private String name; 
	private int operandType = 0;

	public Instruction(String name) {
		this(name, 0);
	}

	public Instruction(String name, int type) {
		this.name = name;
		this.operandType = type;
	}

	public String getName() {
		return name;
	}
	public String getNameLowerCase() {
		return name.toLowerCase();
	}

	public int getType() {
		return operandType;
	}

	public void setType(int type) {
		this.operandType = type;
	}


}

