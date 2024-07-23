package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToItsListLength {

	public static void main(String[] args) {
		
		List<String> str=Arrays.asList("akash","black","green","tushar","yellow","pramod","brown","orange","gray","black");
		List<Integer> list=str.stream().map((a)->a.length()).collect(Collectors.toList());
		System.out.println(list);
		
		Map<Object, List<String>> l=str.stream().collect(Collectors.groupingBy((a)->a.length()));
		System.out.println(l);
		
		Map<String, Integer> s=str.stream().distinct().collect(Collectors.toMap(a->a, a->a.length()));
		System.out.println(s);
		
	}

}
