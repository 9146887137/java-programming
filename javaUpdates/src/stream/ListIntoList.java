package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntoList {

	public static void main(String[] args) {
		
		
		//flatMap is used to convert the stream according provided object
		List<List<Integer>> list=Arrays.asList(Arrays.asList(10,20,33,40),Arrays.asList(55,60),Arrays.asList(70,80),Arrays.asList(91,100,110));
		List<Integer> f=list.stream().flatMap((l->l.stream())).collect(Collectors.toList());
		System.out.println(f);
	}
}
