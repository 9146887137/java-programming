package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class GrowableArray {
	
	public static Object[] ele= {};
	static int size=0;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			if(add(sc.next())) {
				System.out.println(Arrays.toString(ele));
			}
		}
		System.out.println(Arrays.toString(ele));
		
	}
	public static boolean add(Object element) {
		return add(element, size);
	}
	private static boolean add(Object el,int s) {
		 if (s == ele.length) {
	           if(checkDuplicate(el)) {
	        	   ele = grow();
	   	        ele[s] = el;
	   	    // System.out.println(Arrays.toString(ele));
		        size = s + 1;
		        return true;
	           }
		}
		 return false;
	}
	private static Object[] grow() {
		return copy(size+1);
	}
	private static Object[]copy(int size){
		return ele=Arrays.copyOf(ele,size );
	}
	private static boolean checkDuplicate(Object e) {
		for(int i=0;i<ele.length;i++) {
			if(e.equals(ele[i])) {
				return false;
			}
		}
		return true;
	}

}
