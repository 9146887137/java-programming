package strings;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1="akash";
		String s2="hasak";
		
		System.out.println(isAnagram(s1, s2)?"anagram":"not anagram");
		
	}
	public static boolean isAnagram(String s1,String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.toString(c1).equals(Arrays.toString(c2));
	}

}
