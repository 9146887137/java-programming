package array;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticalString {

	public static void main(String[] args) {
		
		String str="akash krishna swapnil vishnu pawan madhav";
		String[] name=str.split(" ");
		List<String> list=new ArrayList<String>();
		for(String s:name) {
			list.add(new String(new StringBuilder(s).reverse()));
		}
		list=list.stream().sorted().map((ele)->new String(new StringBuilder(ele).reverse())).toList();
		System.out.println(list);
	}
}
