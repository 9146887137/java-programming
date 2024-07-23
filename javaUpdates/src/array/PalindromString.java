package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromString {

	public static void main(String[] args) {
		String a="nitin";
		System.out.println(a.equals(new String(new StringBuffer(a).reverse()))?"palindrom":"not palindrom");
		
		System.out.println(Arrays.asList(10,20,30,15,5,39,88,23).stream().sorted().toList());
		
		List<Integer> list=Arrays.asList(10,40,60,70,80,34,56,23).parallelStream().toList();
		
		System.out.println(list);
		
	}

}
