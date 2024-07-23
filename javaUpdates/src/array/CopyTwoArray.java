package array;

import java.util.Arrays;

public class CopyTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,67,90,4,3,3};
		int b[]= {6,7,8,9,0,9,0};
		
		System.out.println("new Array is:"+Arrays.toString(copy(a, b)));
		
	}
	public static int[] copy(int []a, int[]b) {
		int c[]=new int[a.length+b.length];
		int max=a.length>b.length?a.length:b.length;
		for(int i=0,j=0;i<max;i++) {
			if(i<a.length) {
				c[j++]=a[i];
			}
			if(i<b.length) {
				c[j++]=b[i];
			}
		}
		return c;
	}

}
