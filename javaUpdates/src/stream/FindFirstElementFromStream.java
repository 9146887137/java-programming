package stream;

import java.util.Arrays;

public class FindFirstElementFromStream {

	public static void main(String[] args) {
		
		int i=Arrays.asList(10,20,2,45,78,90,45,6,23).stream().findFirst().get();
		System.out.println(i);
	}

}
