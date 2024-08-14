package array;

import java.util.Arrays;

public class MostRepeatedElement {

public static void main(String[] args) {
	
	int[] ar= {1,2,2,2,2,1,1,1,1,12,2,4,4,4,4,4,48,5,6,6,6,6,6,6};
	
	int count=1;
	int max=0;
	int op=0;
	int index=0;
	for (int i = 0; i <ar.length-1; i++) {
		if(ar[i]==ar[i+1]) {
			count++;
		}
		else {
			if(count>max) {
				max=count;
				op=ar[i];
				index=i;		
			}
			count=1;
		}
	}
	System.out.println(op+" is present "+max+" times, it present from index "+(index-(max-1))+" to "+index);
	
}
}
