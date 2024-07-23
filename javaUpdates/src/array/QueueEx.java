package array;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Comparator<Student> com=(s1,s2)->s1.age>s2.age?1:s1.age<s2.age?-1:0;
		
		Queue<Student> q=new PriorityQueue<Student>(com);
		q.add(new Student("Akash", 26));
		q.add(new Student("sumit", 24));
		q.add(new Student("abhi", 22));
		q.add(new Student("shubham", 27));
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		
		for(Student i:q) {
			System.out.println(i);
		}
		
		Iterator<Student> i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		LinkedHashSet<Integer> lhash=new LinkedHashSet<Integer>();
		lhash.add(10);
		lhash.add(45);
		lhash.add(67);
		lhash.add(45);
		lhash.add(30);
		System.out.println(lhash);
		
	}

}
