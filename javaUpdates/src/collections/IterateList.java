package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,40,23,34,12,56,78,89,34,23);
		//1st way to iterate list forEach loop
		
		for (Integer i:list) {
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		
		//2nd way to iterate list using Iterator using iterator() method
		/*
		 * drawback: we cannot iterate in both direction
		 * we can iterate in only forward diraction*/
		
		Iterator<Integer> it=list.iterator();
		while (it.hasNext()) { //hasNext() check there is element present or not at next to the cursor
			System.out.println(it.next()); //it will return that element and move the cursor at next point
		}
		//System.out.println(it.next());//but if the there is no above element at next position and we try to access it we get one Beautiful exception NoSuchElementException
		
		System.out.println("------------------------------");
		
		//3rd way to itarate list using ListIterator
		//iterate in both way forward and backward direction
		ListIterator<Integer> lt=list.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			
		}
		System.out.println("---------------------------------");
		//backward using listIterator
		
		ListIterator<Integer> back=list.listIterator(list.size());//just we have to mention size there from which point i want to iterate
		
		while (back.hasPrevious()) { //it will check at previous index element present or not
			System.out.println(back.previous());//it will return element and move cursor at previous position
			
		}
		System.out.println("-------------------------------");
		
		//4th way using stream
		list.stream().forEach(a->System.out.println(a));
		
		
	}

}
