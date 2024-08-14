package strings;

import java.util.Arrays;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str="aabcdeefghjkwrf";
		Object[] obj=Arrays.stream(str.split("")).distinct().toArray();
		StringBuilder sb=new StringBuilder();
		for(Object ob:obj) {
			sb.append(ob);
		}
		System.out.println(sb.toString());
	}

}
