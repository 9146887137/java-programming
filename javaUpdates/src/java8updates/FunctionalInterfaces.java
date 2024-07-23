package java8updates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		//functional interface is a components of java
		/*
		 * the interface with only one abstract method we call it as functional interface
		 * which provide me the single functionality
		 * basically using this functional interfaces we can perform different type of functions on objects
		 * 
		 * 
		 * Functional interfaces
		 * 1.Supplier 
		 * it is functional interface present at java.util.function
		 * it has only one abstract method called object get()
		 * 
		 * 2.Consumer
		 * void accept(Object)
		 * which accept object to perform operation on object
		 * 
		 * 3.Function
		 * apply(T)
		 * if we want to apply something on any object we use apply method of function interface
		 * 
		 * 4.Predicate
		 * predicate is functional interface present in java.util.function
		 * it has only one method called test(object) which check the specific condition and according to that condition it return boolean
		 * 
		 * 5.Comparator
		 * compare(obj1,obj2)
		 * 
		 * 6.comparable
		 * comapareTo(obj)
		 * 
		 * 
		 * we cannot create object of interface so instead of that we use annonymous inner class using which we crete instance of interface
		 * every interface internally use inner class so when we try to create instance of interface by annonymous type the inner class instance get created.
		 * 
		 * using this methodology we can pass implements to the all the methods of interface without implementing class
		 * .
		 * 
		 * we can make any object of functional type
		 * like comparator type
		 * comaparable type
		 * */
		
		//ex of annonymous inner class
		
		Comparator<Integer> com=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1>o2?1:o1<o2?-1:0;
			}
		};
		
		System.out.println(com.compare(10, 30));
		
		List<Bike> list=new ArrayList<Bike>();
		list.add(new Bike("shine", "honda", 1000000));
		list.add(new Bike("unicorn", "honda", 1400000));
		list.add(new Bike("bobber", "royal infield", 1000000));
		list.add(new Bike("freedom", "bajaj cng", 1600000));
		list.add(new Bike("platina", "bajaj", 90000));
		
		//here we use lambda expression with functional interfaces because functional interface has only one one method so there is no confusion
		//between them so not declare method directly use open close paranthesis and use parameter according to how many parameter accept 
		//by my method of functional interface and we use arrow means lambda to provide implementation
		
		//so i want to make this collection in sorted oderr according to bike price
		Comparator<Bike> com1=(b1,b2)->b1.price>b2.price?1:b1.price<b2.price?-1:0;
		Collections.sort(list, com1);
		for(Bike b:list) {
			System.out.println(b);
		}
		
		
		
		
	}

}
