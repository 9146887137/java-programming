package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentDriver {

	public static void main(String[] args) {
		
//		
//		Comparator<Student> com=(o1,o2)->o1.age>o2.age?1:o1.age<o2.age?-1:0;
//		Comparator<Integer> co=(o1,o2)->o1>o2?1:o1<o2?-1:0;
//		
//		Collection<Student> set=new ArrayList<Student>();
//		TreeSet<Student> set1=new TreeSet<Student>();
//		
//		//List<Integer> c=(List<Integer>) new HashSet<Integer>();
//		
//		set.add(new Student("Akash", 26));
//		set.add(new Student("sumit", 24));
//		set.add(new Student("abhi", 22));
//		set.add(new Student("shubham", 27));
//		
//		set1.add(new Student("Akash", 26));
//		set1.add(new Student("sumit", 24));
//		set1.add(new Student("abhi", 22));
//		set1.add(new Student("shubham", 27));
//		
//		
//		//Collections.sort(set, com);
//		
//		System.out.println(set);
//		
//		
//		TreeMap<Integer, Student> tmap=new TreeMap<Integer, Student>(co);
//		tmap.put(17, new Student("Akash", 26));
//		tmap.put(21, new Student("sumit", 24));
//		tmap.put(3, new Student("abhi", 22));
//		tmap.put(14, new Student("shubham", 21));
//		tmap.put(4, new Student("shubham", 27));
//		tmap.put(4, new Student("shubham", 27));
//
//		System.out.println(tmap.keySet());
//		System.out.println(tmap.clone());
//		
//		System.out.println(set instanceof Collection?" yes":"NO");
//		//System.out.println(c instanceof Collection?" yes":"NO");
//		
		StaticEx1 s=new Stat2();
		System.out.println(Stat2.a);
		
	}

}
