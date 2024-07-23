package array;

import java.util.Arrays;

public class BinarySearchEle {

	public static void main(String[] args) {
		
		
		int[]a= {10,20,30,40,34,12,45,2,90,45,89};
	
		System.out.println("element found at :"+search(sort(a), 12));
		
		
	}
	public static int[] sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		return a;
	}
	public static int search(int[]a,int ele) {
		System.out.println(Arrays.toString(a));
		int first=0,last=a.length-1;
		int mid=(first+last)/2;
		while(first<last) {
			if(a[mid]==ele) {
				return mid;
			}
			else if(ele>a[mid]) {
				first=mid+1;
			}
			else if(ele<a[mid]) {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return -1;
	}

}
