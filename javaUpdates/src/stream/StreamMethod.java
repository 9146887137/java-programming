package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class StreamMethod {

	public static void main(String[] args) {
		
		int[]ar= {20,40,56,67,89,23};
//		boolean ans=Arrays.stream(ar).allMatch(a->a>19);
//		System.out.println(ans);
//		System.out.println(Arrays.stream(ar).average().getAsDouble());
		
		
		/*
		 * merge two list and remove duplicate element from list using stream*/
		List<Integer> list=new ArrayList();
		List<Integer> list1=new ArrayList();
		list.add(10);
		list1.add(12);
		list.add(16);
		list1.add(16);
		list.add(1);
		list1.add(11);
		list.add(10);
		list.add(19);
		list1.add(119);
		list1.add(45);
		list.add(19);
		list1.add(78);
		list.addAll(list1);//merged
		
		list=list.stream().distinct().toList();
		System.out.println(list);
		
//		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
//		lh.add(20);
//		lh.add(30);
//		lh.add(10);
//		lh.add(30);
//		lh.add(22);
//		lh.add(2);
//		lh.add(1);
//		System.out.println(lh);
//		
//		TreeSet<Integer> t=new TreeSet<Integer>(lh);
//		HashSet<Integer> h=new HashSet<Integer>(lh);
//		System.out.println(t);
//		System.out.println(h);
		
	}

}
