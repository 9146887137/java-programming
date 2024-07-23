package array;

import java.util.ArrayList;

public class MySetDriver {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new HashsetDemo();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(20);
		ar.add(20);
		ar.add(89);
		ar.add(2);
		
		System.out.println(ar.hashCode());
	}

}
