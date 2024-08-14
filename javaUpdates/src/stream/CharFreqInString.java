package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFreqInString {

	public static void main(String[] args) {
		
		String str="akashmore";
		
		Map<String,Long> map=Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy((a)->a,Collectors.counting()));
		System.out.println(map);
	}

}
