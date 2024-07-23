package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterPartition {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("akash","ramesh","parthiv","rameshwar","darshan","ravi");
		
		Map<Boolean, List<String>> map=names.stream().flatMap((name)->Arrays.asList(name.split("")).stream()).collect(Collectors.partitioningBy((a)->a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")));
		System.out.println(map);
		System.out.println(map.get(true));
		System.out.println(map.get(false));
		
	}

}
