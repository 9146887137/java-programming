package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,5,1,5,90,10,67,2,5,1};
		//int b[]=new int[a.length];

		
		//this is first way to remove duplicate without using built in
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&a[i]!=-1) {
					a[j]=-1;
				}
			}
			if(a[i]!=-1) {
				count++;
			}
		}
		System.out.println(count);
		int[]b =new int[count];
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]!=-1) {
				b[j++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		
		//this is second way because LinkedHashSet does'nt allow duplicate and also follow insertion order
//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		for(Integer i:a) {
//			set.add(i);
//		}
//		System.out.println(set);
		
		//third way using built in method of Arrays called Stream
		int[]un=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(un));
	}

}
