package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
	List<Integer> i=Arrays.asList(10,20,45,23,89,67,45,34);
	
	Stack<Integer> stack=new Stack<Integer>();
	
	for(Integer e:i) {
		if(!stack.contains(e)) {
			stack.push(e);
		}
	}
	
	System.out.println(stack);
	
	Collections.sort(stack);
	System.out.println(stack);

	}

}
