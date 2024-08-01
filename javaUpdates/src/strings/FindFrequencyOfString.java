package strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindFrequencyOfString {

	public static void main(String[] args) {
		String str="apple orange lamon apple pineapple apple orange coconut arange apple";
		
		String[] s=str.split(" ");
		
		int max=Integer.MIN_VALUE;
		String ele=" ";
		for (String string : s) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				
				if(string.equals(s[i])) {
					count++;
				}
				
			}
			if(max<count) {
				max=count;
				ele=string;
			}
		}
		System.out.println(Arrays.toString(s));
		System.out.println(ele+" : "+max);
		
	}

}
