package array;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		
		int[]a= {12,56,76,89,12};
		int[]b= {34,78,90,2,1,3,5,1,1,1,1,1,1};
		int[]d= {1,78,90,34,3,43,45,12,78};
		zigZagCopy(a, b,d);
		
	}
	public static void zigZagCopy(int[]a,int[]b,int[]d) {
		int[]c=new int[a.length+b.length+d.length];
		
		int max=a.length>b.length?a.length:b.length>d.length?b.length:d.length;
		for(int i=0,j=0;i<max;i++) {
			if(i<a.length) {
				c[j++]=a[i];
			}
			if(i<b.length) {
				c[j++]=b[i];
			}
			if(i<d.length) {
				c[j++]=d[i];
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
