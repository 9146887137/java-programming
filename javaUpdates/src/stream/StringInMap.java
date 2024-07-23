package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringInMap {

	
public static void main(String[] args) {
List<String> s=Arrays.asList("akash","pawan","tushar","swapnil","ram","ramesh");
	
	Map<String,Integer> map=s.stream().collect(Collectors.toMap(a->a, a->a.length()));
System.out.println(map);
}

}
