package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPartitionUSingStream {

	public static void main(String[] args) {
		
		Map<Boolean, List<Integer>> partition=Arrays.asList(10,23,12,45,55,3,67,44,78,90,34,23,89,57,5,32).stream().collect(Collectors.partitioningBy((a)->a%2==0));
		
		/*the partitionBy method accept predicate type reference and it make two partition in map according to true and false key and put list of even and odd list
		 * separately*/
		List even=partition.get(true);
		List odd=partition.get(false);
		System.out.println(even);
		System.out.println(odd);
	}

}
