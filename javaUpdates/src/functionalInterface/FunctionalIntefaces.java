package functionalInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalIntefaces {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,23,34,78,90,55,67);
	
		
		//1.filter(Predicate)
		//list=list.stream().filter((obj)->obj%2==0).collect(Collectors.toList());
		
		list=list.stream().map((obj)->obj%2==0?obj+1:obj-1).toList();
		
		
		System.out.println(list);
	}

}
