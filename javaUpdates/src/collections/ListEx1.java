package collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		
		//way to create list using implementing class called ArrayList
		/*
		 * characteristics:
		 * 1.it follow insertion order
		 * 2.it allow duplicate
		 * 3.list follow indexing means with the help of index we can perform any operation an list
		 * a)add,remove,search,update*/
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(3);
		list.add(34);
		list.add(12);
		list.add(23);
		//add with the help of index value
			list.add(3, 45);
			list.remove(2);//remove with the help of index value.
		
		//there is one more constructor which accept another collection.
		List<Integer> list1=new ArrayList<Integer>(list);
		list1.add(25);
		list1.add(78);
		list.addAll(list1);//with the help of this method we can add collection into another collection.
		
		System.out.println(list1);//if we try to print reference that time toString() method get automatically invoke.
	}
}
