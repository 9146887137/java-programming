package array;

import java.util.Arrays;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {
		
		
		int[]a= {10,20,30,40,50};
		
		
		//rotate right
		//int last=a[a.length-1];
		
//		for(int i=a.length-1;i>0;i--) {
//			a[i]=a[i-1];
//		}
//		a[0]=last;
//		
//		System.out.println(Arrays.toString(a));
		
		
		//rotate left
		
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 20));
		
		Arrays.sort(a, 0, a.length);
		System.out.println(Arrays.toString(a));
		
	}
}
