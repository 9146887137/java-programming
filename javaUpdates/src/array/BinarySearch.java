package array;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {10,40,56,34,90,45,34,23};
		
		int res=binarySearch(sort(a), 45);
		System.out.println(res>=0?"element present at "+res+" position":res);
		
	}
	public static int[] sort(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++)
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
	
	public static int binarySearch(int[]a,int ele) {
		int first=0,last=a.length-1;
		int mid=(first+last)/2;
		while(first<last) {
			if(a[mid]==ele) {
				return mid;
			}
			else if(a[mid]<ele) {
				first=mid+1;
			}
			else if(a[mid]>ele) {
				last=mid-1;
			}
			System.out.println(mid);
			mid=(first+last)/2;
		}
		return -1;
	}
}
