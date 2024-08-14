package collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuDemo {

	public static void main(String[] args) {
		
		/*queue is data structure present in java which help me to store multiple elements together
		 * following the queue mechanism
		 * queue is a sub interface of collection interface it consist all the methods of collection interface
		 * and also it has some its own features
		 * 
		 * Queue is super interface in queue data structure
		 * 
		 * it has two implementing classes called PriorityQueue and LinkedList
		 * 
		 * method of queue
		 * poll()
		 * peek()
		 * offer()
		 * 
		 * thoes three methods and collections all methods are inherited inside priorityQueue*/
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>(Arrays.asList(10,20,13,2,2,45,1,67,12,78,90,1));
		System.out.println(p);
		
		p.add(0);
		p.offer(66);//add element at tell of the queue but element is minimum element it set at the head of queue
		System.out.println(p.poll());;//remove element from queue at side head
		p.offer(6);
		System.out.println(p.peek());
		System.out.println(p.peek());
		System.out.println(p.peek()); //retrive element from head of queue
		System.out.println(p);
		
		
		/*deque is sub interface of queue interface we call it as double ended queue
		 * means we can remove,add,find element from queue
		 * pollFirst() -remove element from head of queue
		 * pollLast() -remove from tail of queue
		 * peekFirst() -retrieve from head of queue
		 * peekLast()- retrieve from tail of queue
		 * offerFirst()
		 * offerLast()
		 * element()
		 * peek()
		 * offer()
		 * push(ele)
		 * pop()
		 * remove()*/
		Deque<Integer> deque=new LinkedList<Integer>(p);
		
		System.out.println(deque.pollLast()); 
		System.out.println(deque.pollFirst());
		System.out.println(deque.removeFirstOccurrence(2));
		System.out.println(deque.removeLastOccurrence(1));
		deque.addFirst(23);
		deque.addLast(56);
		
		deque.add(null);
		
		System.out.println(deque.element());
		System.out.println(deque.peek());
		System.out.println(deque.pop()); //remove element head of queue
		
		System.out.println(deque.offerFirst(55));
		System.out.println(deque.offerLast(99));
		
		System.out.println(deque);
		
	}

}
