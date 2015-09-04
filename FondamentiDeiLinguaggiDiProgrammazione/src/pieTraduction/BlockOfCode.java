package pieTraduction;

import java.util.ArrayList;
import java.util.Collection;

public class BlockOfCode {
	private ArrayList<String> code=new ArrayList<String>();
	public BlockOfCode() {
	}
	public void addCode(String code){
		this.code.add(code);
	}
	
	public void addCode(Collection<? extends String> cod){
		this.code.addAll(cod);
	}
	public void addFirst(BlockOfCode last) {
		code.addAll(0, last.code);
	}

}
