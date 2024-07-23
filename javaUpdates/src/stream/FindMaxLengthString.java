package stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxLengthString {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("india","akash","ramesh","parmeshwar","rameshwar","ahemadnagar");
		String max=list.stream().max((s1,s2)->s1.length()>s2.length()?1:s1.length()<s2.length()?-1:0).get();
		System.out.println(max);
	}

}
