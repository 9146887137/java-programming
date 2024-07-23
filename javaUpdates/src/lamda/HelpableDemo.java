package lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HelpableDemo {

	public static void main(String[] args) {
		
//		Helpable helpable=(a,b)->a+b;
//		
//		System.out.println(helpable.help(10,20));
		
//		Comparator<Student> comparator=new Comparator<Student>() {  it is annonymous class using this we can pass the implementation to 
																	//abstract method which is present inside interface
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.age>o2.age?1:o1.age<o2.age?-1:0;
//			}
//		};
		
		//lamba expression
		Comparator<Student> comparator=(o1,o2)->o1.age>o2.age?1:o1.age<o2.age?-1:0;
		
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student("akash more", 21, 80));
		list.add(new Student("rajesh", 34, 67));
		list.add(new Student("abhi", 26, 70));
//		list.add(new Student("shubham", 23, 83));
//		list.add(new Student("sumit", 22, 89));
//		
//		System.out.println(list);
//		Collections.sort(list,comparator);
//		System.out.println(list);
		
		
		TreeSet<Student> set=new TreeSet<Student>(comparator);
		set.add(new Student("akash more", 21, 80));
		set.add(new Student("rajesh", 34, 67));
		set.add(new Student("abhi", 26, 70));
		set.add(new Student("shubham", 23, 83));
		set.add(new Student("sumit", 22, 89));
		
		System.out.println(set);
		
		Collection<Integer> collection=new Collection<>() {
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return set.size();
			}
			
			public boolean add(Integer e) {
				return true;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String toString() {
				return new String("hello");
			}
		};
		
		collection.add(20);
		collection.add(45);
		System.out.println(collection);
		
	}
}
