package array;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionPract {
	

	public static void main(String[] args) {
		
		Comparator<Student> com=(e1,e2)->e1.age>e2.age?1:e1.age<e2.age?-1:0;
			
			
		Collection<Student> col=new TreeSet<Student>(com);
		col.add(new Student("dhanashree", 45));
		col.add(new Student("pratiksha", 99));
		col.add(new Student("pratiksha", 99));
		col.add(new Student("abhi", 56));
		col.add(new Student("aditya", 78));
		
		List<Student> o=col.stream().toList();
		System.out.println(o.get(o.size()-1));
		
		//System.out.println(col);
		
		
		
		
	}

}
