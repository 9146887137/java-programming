package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Annonymous {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,10,33,50,70,57,23,66,11,9,34,45);
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer>l2=new ArrayList<Integer>();
		
		for(Integer i:list) {
			if(!l1.contains(i)&&!l2.contains(i)) {
				l1.add(i);
			}
			else if(!l2.contains(i)&&!l1.contains(i)) {
				l2.add(i);
			}
		}
		
		System.out.println(l1);
		System.out.println(l2);
		
		
	}

}
