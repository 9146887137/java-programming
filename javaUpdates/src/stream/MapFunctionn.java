package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapFunctionn {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(56,3,98,42,9,2,89,5,45,9,0,5,9);
		
		List<Integer> list1=l.stream().distinct().collect(Collectors.toList()); //find unique element from stream
		System.out.println(list1);
		
		List<Integer> list2=l.stream().dropWhile(num->num%2==0).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3=l.stream().filter(num->num>=70).collect(Collectors.toList()); 
		System.out.println(list3);
		Optional<Integer>max=l.stream().max((n1,n2)->n1>n2?1:n1<n2?-1:0);
		System.out.println(max.get());
	}

}
