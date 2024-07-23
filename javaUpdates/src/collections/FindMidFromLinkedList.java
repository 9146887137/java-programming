package collections;

import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import array.Student;



public class FindMidFromLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(40);
		list.add(78);
		list.add(67);
		
		Comparator<Student> cm=(a,b)->a.age>b.age?1:a.age<b.age?-1:0;
		
		
		
PriorityQueue<Student> l=new PriorityQueue<Student>(cm);
		
		//we make it as non-generic but inside this queue we can add only comaparable type of object
		l.add(new Student("akash", 23));
		l.add(new Student("raju", 24));
		l.add(new Student("ganesh", 22)) ;
		l.add(new Student("tukaram", 21));
		
		
		
		System.out.println(l);
	}

}
