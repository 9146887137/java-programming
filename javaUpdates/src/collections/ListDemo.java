package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		
		//collection is group of elements or group of objects where we put multiple objects together.
		//and also collection provide me the mechanism to store and manipulate the objects.
		//there are two hierarchy which help me to store multiple elements together 1)collection hierarchy2)Map hierarchy
		
		//1)collection hierarchy:
		//this is group of classes and interfaces which provide me different mechanism to store and manipulates objects
		//collection provide me the different data structures
		/*
		 * 1.List
		 * 2.Set
		 * 3.Queue
		 * 
		 * List is data structure or interface which help me to storing multiple elements together and provide some methods to manipulate
		 * the different kind of operations
		 * there are some characteristics of list
		 * 1.list follow insertion order
		 * whenever we add elements on any position it add on only that position
		 * 2.list follow indexing
		 * with the help of index value we can perform any kind of operation on elements
		 * like access,remove,add,update
		 * 3.it allow duplicate elements.
		 * 4.this is unordered collection.
		 *
		 *
		 *
		 *but list is interface so we can not create instance of interface
		 *so there are some implementing classes which help me provide the implementation to the specifications
		 *
		 *ArrayList
		 *Vector
		 * */
		
		List<Integer> list=new ArrayList<Integer>() ;
		list.add(20);
		list.add(56);
		list.add(36);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(1));;//find the element using index value
		
		//System.out.println(list.contains(10));//using contains method we can check the specific element present or not in collection
		//if it present inside in the list it return me the true otherwise return false
		
		//Comparator<Integer> com=(a1,a2)->a1>a2?1:a1<a2?-1:0;
		//list.sort(com);//sort method accept comparator type reference
		//comparator represent how to compare to value 
		//System.out.println(list);
		//System.out.println(list.subList(0, 2));
		
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(20);
		li.add(56);
		li.add(36);
		li.add(20);
		li.add(50);
		
		System.out.println(li.retainAll(list));
		System.out.println(list);
		System.out.println(li);
		System.out.println(li.containsAll(list));
		//System.out.println(li.removeAll(list));
		System.out.println(li);
		System.out.println(li.removeIf((a)->a>35));
		System.out.println(li);
		System.out.println(li.set(1, 35));
		System.out.println(li);
		System.out.println(Arrays.toString(li.toArray()));
		//System.out.println(li.);
		
		System.out.println(li.stream().mapToInt(a->a).sum());
		/*
		 * How to iterate collection
		 * 1.for each loop
		 * 2.iterator(): we can iterate collection in only forward direction not in backward
		 * 3.list iterator
		 * 4.stream api
		 * for loop
		 * 
		 * 
		 * remove duplicate 
		 * 1.stream
		 * 2.for loop
		 * if we try to use for each loop we get ConcurrentmodificationException
		 * */
		
	}

}
