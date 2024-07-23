package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class HashsetDemo extends ArrayList<Integer>{

	private TreeSet<Object> tr;

	public HashsetDemo() {
		tr=new TreeSet<Object>();
	}
	
	public boolean addElement(Integer i) {
		return add(i);
	}
	
	@Override
	public boolean add(Integer e) {
		return tr.add(e);
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(tr);
	}
	
	
}
