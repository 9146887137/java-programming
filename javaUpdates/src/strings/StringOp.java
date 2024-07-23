package strings;

import java.util.Arrays;

public class StringOp {

	public static void main(String[] args) {
		
		
		String str=new String("indian army");
		System.out.println(str);
		
		System.out.println();;
		int a=Arrays.stream(str.chars().toArray()).max().getAsInt();
		System.out.println((char)a);
	}
}
