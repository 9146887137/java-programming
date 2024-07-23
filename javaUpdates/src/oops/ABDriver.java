package oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ABDriver {

	public static void main(String[] args) {
		
		InterfaceA a=new ClassB();
		System.out.println(a instanceof ClassB);
		System.out.println(a instanceof InterfaceA);
		
		//ClassB b=new CheckFinalClass();
		
		Collection<Integer> ar=new ArrayList<Integer>();
		HashSet<Integer> h=(HashSet<Integer>) ar;
		System.out.println(ar instanceof List<Integer>);
		System.out.println(ar instanceof HashSet<Integer>);
		//b.add();
	}
}
