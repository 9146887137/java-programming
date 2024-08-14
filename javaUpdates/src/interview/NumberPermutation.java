package interview;

import java.util.ArrayList;
import java.util.List;

public class NumberPermutation {

	public static void main(String[] args) {
		
		System.out.println(getPermutations(123));;
	}
	public static List<Integer> getPermutations(int num) {
		
		int n=num;
		int s=size(num);
		
		List<Integer> list=new ArrayList<Integer>();
		
		while (true) {
			int rem=n%10;
			int dev=n/10;
			n=(int)(Math.pow(10,s-1))*rem+dev;
			if(n==num) {
				break;
			}
			list.add(n);
		}
		return list;
	}
	public static int size(int num) {
		return String.valueOf(num).length();
	}

}
