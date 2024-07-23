package array;

import java.util.Arrays;

public class FindMax {

	public static void main(String[] args) {
		
		int[]a= {10,34,2,45,12,56,12,89,23,345,5,90};
		System.out.println(Arrays.stream(a).max().getAsInt());
		System.out.println(secMax(a));
	}
	public static int secMax(int[]a) {
		int max=0;
		int secmax=0;
		for(int i:a) {
			if(i>max) {
				secmax=max;
				max=i;
			}
			else if(i>secmax) {
				secmax=i;
			}
		}
		return secmax;
	}
}
