package array;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapHierarchy {

	public static void main(String[] args) {
		
		Comparator<Student> com=(s1,s2)->s1.age>s2.age?1:s1.age<s2.age?-1:0;
		 Map<Student, String> map=new TreeMap<Student, String>(com);
		 map.put(new Student("ramesh", 23), "jalna");
		 map.put(new Student("abhijeet", 22), "Parbhani");
		 map.put(new Student("shubham", 24), "beed");
		 map.put(new Student("krishna", 21), "solapur");
		 map.put(new Student("aditya", 22), "dharashiv");
		 
		for(Student st:map.keySet()) {
			System.out.println(map.get(st));
			//System.out.println(map.putIfAbsent(new Student("krishna", 21), "pune"));
		}
		System.out.println(map.values());
	}
}
