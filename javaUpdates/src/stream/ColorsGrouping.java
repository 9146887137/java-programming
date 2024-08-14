package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColorsGrouping {

	public static void main(String[] args) {
		
		List<String> colors=Arrays.asList("red","orange","red","black","pink","pink","orange","green","brown","grey","grey","pink","white","red","blue","navy blue");
		Map<String, List<String>> buckets=colors.stream().collect(Collectors.groupingBy(color->color));
		System.out.println(buckets);
		System.out.println(getMaxColorBuckets(buckets));
	}
	//find the bucket which has maximum number of color buckets.
	public static String getMaxColorBuckets(Map<String, List<String>> buckets) {
		String bucket="";
		int max=0;
		for(String s:buckets.keySet()) {
			int len=buckets.get(s).size();
			if(len>max) {
				max=len;
				bucket=s;
			}
		}
		return bucket;
	}

}
