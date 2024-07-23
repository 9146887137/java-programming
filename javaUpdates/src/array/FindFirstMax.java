package array;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindFirstMax {

	public static void main(String[] args) {
		
		int a[]= {10,56,55,90,3,12,6,890,56,9};
		System.out.println(firstMax(a));
	}
	public static int firstMax(int[]a) {
		/*this logic is used to find first max element from array using stream
		 * return Arrays.stream(a).max().getAsInt();
		 */
		
		/*
		 * this is using for each loop and variable
		 * where we compare 2 elements if its greater than max its copy inside max
		 * int max=0;
		
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
		*/
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		for(int i:a) {
			tr.add(i);
		}
		
		return tr.last();
	}

}
