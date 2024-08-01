package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueWithFrequency {

	public static void main(String[] args) {
		
		String s="apple orange coconut apple apple banana orange pineapple apple coconut apple orange";
		Map<String, Long> f=Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy((fruit)->fruit,Collectors.counting()));
		System.out.println(f);
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.
	}

}
