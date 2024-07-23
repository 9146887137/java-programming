package array;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[]a= {3,4,2,6,-1,1,5,7,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(missing(a));
		
	}
	public static int missing(int[]a) {
		for(int i=1,j=a[1];i<a.length;i++) {
			//System.out.println(j);
			if(a[i]!=j++) {
			return i;
			}
		}
		return 0;
	}
}
