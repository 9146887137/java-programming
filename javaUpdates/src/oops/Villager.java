package oops;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;

public sealed class Villager extends School permits ShowRoom{

	public static void main(String[] args) {
		
		AbstractSet<Integer> ab=new HashSet<Integer>(Arrays.asList(10,20,67,45,null));
		System.out.println(ab);
		
	}
}
