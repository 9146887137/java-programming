package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListByLength {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("akash","ram","sam","prakash","ramesh","zakas");
		Map<Integer, List<String>> o=list.stream().collect(Collectors.groupingBy((a)->a.length()));
		System.out.println(o);
	}

}
