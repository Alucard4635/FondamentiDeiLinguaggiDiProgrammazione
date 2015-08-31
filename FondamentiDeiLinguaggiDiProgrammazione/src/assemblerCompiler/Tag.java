package assemblerCompiler;

import java.util.LinkedList;

public class Tag {
	public final String name;
	public final int whereIs;
	private LinkedList<Integer> forwardReferedAddress=new LinkedList<Integer>();
	private int definitionAddress=-1;
	

	public Tag(String id, int ip) {
		this.name = id;
		whereIs=ip;
	}
	public boolean isDefined() {
		return definitionAddress>=0;
	}
	public boolean isForwardRefered() {
		return forwardReferedAddress.size()>0;
	}
	public void addForwardReference(int ip) {
		forwardReferedAddress.add(ip);
	}
	public LinkedList<Integer> getForwardReferedAddress() {
		return forwardReferedAddress;
	}
	public void setForwardReferedAddress(LinkedList<Integer> forwardReferedAddress) {
		this.forwardReferedAddress = forwardReferedAddress;
	}
	public int getDefinitionAddress() {
		return definitionAddress;
	}
	public void setDefinitionAddress(int definitionAddress) {
		this.definitionAddress = definitionAddress;
	}
	

}
