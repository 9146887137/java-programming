package array;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateChar {

	public static void main(String[] args) {
		
		//remove duplicate character from String
		String str="pune is beautifull city present in maharashtra";
		StringBuilder builder=new StringBuilder();
		for(String s:Arrays.asList(str.split("")).stream().distinct().toList()) {
			builder.append(s);
		}
		System.out.println(builder);
		
		
		
	}
	
	

}
