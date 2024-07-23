package array;

import java.util.Arrays;

public class PrimeNumberArray {

	public static void main(String[] args) {
		
		int ar[]= {10,2,56,78,90,23,56,57,12,90,34,13,7,5,78};
		int[]a=Arrays.stream(ar).distinct().filter((ele)->isPrime(ele)).toArray();
		System.out.println(Arrays.toString(a));
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%2==0)
				return false;
		}
		return true;
	}

}
