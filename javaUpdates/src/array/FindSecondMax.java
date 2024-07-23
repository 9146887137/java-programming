package array;

import java.util.Arrays;

public class FindSecondMax {

	public static void main(String[] args) {
		
		int[]a= {12,67,34,90,89,3,90,12,23,345,345,6,55};
		
		/*
		 * first logic
		int fmax=a[0];
		int smax=fmax;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				if(smax!=fmax) {
					smax=fmax;
				}
				fmax=a[i];
			}
		}
		System.out.println(smax);
		*/
		
		
		//second way to find second max from array
		Arrays.sort(a, 0, a.length/2);
		System.out.println(a[a.length/2]); //this is the way to find second max number from half an array
		
		//third way ton find second max from array
		
		int[] b=Arrays.stream(a).distinct().toArray();
		System.out.println(b[b.length-2]);
		
		
		System.out.println(Arrays.binarySearch(a, 6));;
		
		
	}

}
