package exceptions;

import java.io.IOException;

public class CheckedUnchecked {

	public static void main(String[] args) {
		
		
		Exception e=new IOException();
		
		if(e instanceof RuntimeException) {
			System.out.println("this is unchecked exception");
		}
		else {
			System.out.println("this is checked");
		}
	}

}
