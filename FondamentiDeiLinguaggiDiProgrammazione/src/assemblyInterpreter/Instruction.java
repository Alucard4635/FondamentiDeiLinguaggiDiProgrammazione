package assemblyInterpreter;

public class Instruction {
	private String name; // E.g., "iadd", "call"
	private int[] type = new int[1];
	private int n = 0;

	public Instruction(String name) {
		this(name, 0);
		n = 0;
	}

	public Instruction(String name, int a) {
		this.name = name;
		type[0] = a;
		n = 1;
	}

	public String getName() {
		return name;
	}
	public String getNameLowerCase() {
		return name.toLowerCase();
	}


}

