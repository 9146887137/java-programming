package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFreqOfchar {

	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("mango","apple","apple","mango","banana","coconut","apple","orange","banana","mango");
		Map<String, Long> map=fruits.stream().collect(Collectors.groupingBy(f->f,Collectors.counting()));
		System.out.println(map);
	}

}
