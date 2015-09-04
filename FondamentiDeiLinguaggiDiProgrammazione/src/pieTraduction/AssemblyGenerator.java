package pieTraduction;

import java.util.ArrayList;

public abstract class AssemblyGenerator implements PieTraductor {
	
	ArrayList<String> assemblyCode=new ArrayList<String>();

	public void addInt(String text) {
		assemblyCode.add("iconst "+text);
		
	}
	
}
