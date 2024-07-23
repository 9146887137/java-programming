package stream;

import java.util.Arrays;

public class UniqueWord {

	public static void main(String[] args) {
		
		String  str="apple banana orange coconut apple orange";
		System.out.println(Arrays.toString(Arrays.stream(str.split(" ")).distinct().toArray()));;
		
	}

}
