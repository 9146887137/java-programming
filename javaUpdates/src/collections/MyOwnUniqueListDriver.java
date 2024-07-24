package collections;

import java.util.ArrayList;

public class MyOwnUniqueListDriver {

	public static void main(String[] args) {
		
		MyList m=new MyOwnUniqueList();
		m.addToList(10);
		m.addToList(12);
		m.addToList(15);
		m.addToList(34);
		m.addToList(35);
		m.addToList(36);
		System.out.println(m);
		
		System.out.println(m.removeFromList(34));
		System.out.println(m);
		m.addToList(66);
		System.out.println(m);
	}
	
}
