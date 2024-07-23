package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinElement {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,50,70,2,45,12,9,234,2,99,3,-3);
		//int min=list.stream().min((a,b)->a>b?1:a<b?-1:0).get();
		
		//2nd way to find min
		System.out.println(list.stream().sorted().findFirst().get());
		
		//find max element
		System.out.println(list.stream().max((a,b)->a>b?1:a<b?-1:0).get());
		//if number is even +1
		System.out.println(list.stream().map((a)->a%2==0?a+1:a-1).toList());
	}

}
