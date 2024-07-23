package oops;

public abstract interface InterfaceA {

	
	default void add() {
		System.out.println("add from interface");
		mul();
	}
	
	void sub() ;
	
	private void mul() {
		System.out.println("private from interface");
	}
	

}
