package lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class STController {

	public static void main(String[] args) {
		
		Comparator<Mobile> comparator=(o1,o2)->o1.mobNo>o2.mobNo?1:o1.mobNo<o2.mobNo?-1:0; 
			
		TreeMap<Mobile, Student> tm=new TreeMap<>(comparator);
		tm.put(new Mobile(914688713), new Student("A", 23, 81));
		tm.put(new Mobile(915588713), new Student("Z", 23, 80));
		tm.put(new Mobile(881468873),new Student("H", 23, 80));
		tm.put(new Mobile(814688737), new Student("A", 21, 49));
		tm.put(new Mobile(914087137), new Student("N", 22, 79));
		tm.put(new Mobile(917688717), new Student("L", 24, 99));
		tm.put(new Mobile(917688717), new Student("L", 24, 99));
				
		System.out.println(tm.comparator());
		System.out.println(tm);
		
		
	}

}
