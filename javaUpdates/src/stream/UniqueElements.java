package stream;

import java.util.Arrays;
import java.util.List;

public class UniqueElements {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,11,10,23,45,67,11,90,4).stream().distinct().toList();
		System.out.println(list);
	}

}
