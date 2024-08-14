package oops;

import java.awt.print.Printable;

public interface X {
	
	final int a=10;
	
	default void p() {
		print();
	}
	private void print() {
		System.out.println("private non static concrete");
	}
	
	public static void demo() {
		System.out.println("static concrete from interface");
	}

}
