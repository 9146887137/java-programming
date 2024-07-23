package oops;

public class CheckSingleTone {

	public static void main(String[] args) {
		
		System.out.println(SingletTone.instance);
		System.out.println(SingletTone.instance);
		System.out.println(SingletTone.getInstance());
	}

}
