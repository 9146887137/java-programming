package collections;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//hashSet is the unordered collection which help me store multiple unique objects together on random sequence
		/*
		 * hashset not allow duplicate
		 * it is unordered
		 * hashset not follow insertion order
		 * hashset internally use hashmap means whenever we add element it will be add as a key in hashmap
		 * because of key cant be duplicate
		 * and every time it will generate hash value of element and check if any key contains with this hash value if present it will replace by new key
		 * 
		 * it allow null object
		 * but if perform some operations like removeIf method we get NullPointerException if there is any element present with null*/
		
		HashSet<Integer> hashset=new HashSet<Integer>(Arrays.asList(10,30,45,23,10,30,45,56,78,12));
		HashSet<Integer> hashset1=new HashSet<Integer>(Arrays.asList(10,30,45,23,10,30,45,56,78,12));
		System.out.println(hashset);
		
		hashset.add(99);
		hashset.add(90);
		hashset1.add(null);
		//hashset.removeIf((a)->a%2==0);
		System.out.println(hashset.retainAll(hashset1));
		System.out.println(hashset);
		Iterator<Integer> i=hashset1.iterator();
		
		Spliterator<Integer> sp=hashset1.spliterator();
		System.out.println(sp.characteristics());
		
		
		SortedSet<Integer> n=new ConcurrentSkipListSet<Integer>();
		n.add(10);
		n.add(20);
		n.add(1);
		n.add(55);
		n.add(13);
		n.add(78);
		
		System.out.println(n);
		
		NavigableSet<Integer> set=new TreeSet<Integer>(n);
		set.add(20);
		set.add(11);
		set.add(89);
        System.out.println(set.floor(11));
		System.out.println(set.ceiling(11));
		System.out.println(set.tailSet(11,false));
		System.out.println(set.higher(11));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.lower(11));
		System.out.println(set.subSet(1, 2));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.headSet(15));
		//System.out.println(set.descendingIterator());
		System.out.println(set.descendingSet());
		
		System.out.println(set);
		
	}

}
