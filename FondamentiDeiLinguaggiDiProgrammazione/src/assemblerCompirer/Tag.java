package assemblerCompirer;

public class Tag {
	public final String name;
	private int whereIs;
	private boolean isDefined=false;
	private int forwardReferedAddress=-1;

	public Tag(String id, int ip) {
		this.name = id;
		whereIs=ip;
	}
	public boolean isDefined() {
		return isDefined;
	}
	public void setDefined(boolean isDefined) {
		this.isDefined = isDefined;
	}
	public boolean isForwardRefered() {
		return forwardReferedAddress<0;
	}
	public void addForwardReference(int ip) {
		forwardReferedAddress=ip;
	}
	public int getWhereIs() {
		return whereIs;
	}
	public void setAddress(int size) {
		whereIs=size;
	}


}
