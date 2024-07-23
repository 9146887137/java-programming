package array;

import java.util.Arrays;
import java.util.List;

public class RevString {

	public static void main(String[] args) {
		
		String str="akash dhanashree abhi aditya adinath kishya";
		List<StringBuilder> list=Arrays.asList(new String(new StringBuilder(str).reverse()).split(" ")).stream().sorted().map((e)->new StringBuilder(e).reverse()).toList();
		System.out.println(list);
	}
}
