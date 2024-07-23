package array;

import java.time.chrono.JapaneseChronology;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LengthOfDuplicate {

	public static void main(String[] args) {
		
		int[]a= {1,2,56,2,89,45,34,34,90,56,89};
		System.out.println("Count Of duplicate element is :"+(a.length-Arrays.stream(a).distinct().count()));
		
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> dup=new HashSet<Integer>();
		for(int i:a) {
			if(set.add(i)) {
			}
			else {
				dup.add(i);
			}
		}
		System.out.println(dup);
	}

}
