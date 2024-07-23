package array;

import java.util.Arrays;

public class StringOp {

	public static void main(String[] args) {
		
		String str="pune is historical capital of india";
		System.out.println(Arrays.stream(str.split(" ")).sorted().toList());
		
	}

}
