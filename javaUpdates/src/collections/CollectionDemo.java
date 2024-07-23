package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(25);
		list.add(78);
		list.add(67);
		list.add(67);
//		System.out.println(list);
//		
//		System.out.println(list.contains(67));
//		
//	Collections.sort(list);
//	System.out.println(list);
//	System.out.println(Collections.binarySearch(list, 25));
	
	
	
	String s="india is my country";
	String[] st=s.split(" ");
	System.out.println(Arrays.toString(st));
	
	List<String> ar=Arrays.asList(st);
	System.out.println(ar);
	}

}
