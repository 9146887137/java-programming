package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,34,12,2,67,99,10,10,10,99,99,32,67,78,89,5,7,44);
		Map<Object, List<Integer>> l=list.stream().collect(Collectors.groupingBy((a)->a));
		System.out.println(l);
	}
}
