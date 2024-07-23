package annonymousInnerClass;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTreeSet {

	public static void main(String[] args) {
		
		//here we will use lambda expression to provide implementation to functional interface method
		Comparator<Student> com=(s1,s2)->s1.phone>s2.phone?1:s1.phone<s2.phone?-1:0;
		TreeSet<Student> set=new TreeSet<Student>(com);
		
		//here we add the students inside treeset
		set.add(new Student("akash","jalna", 24,9146887137l , 89));
		set.add(new Student("ram","nagar", 27,8146887137l , 99));
		set.add(new Student("raju","pune", 25,9146997137l , 79));
		set.add(new Student("ankush","jalna", 22,9146887132l , 69));
		set.add(new Student("swapnil","nashik", 23,9106887137l , 88));
		
		System.out.println(set);
		
		
	}

}
