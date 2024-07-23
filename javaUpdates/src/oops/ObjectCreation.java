package oops;

public class ObjectCreation {
	
	int a=10;
	//non static initiqalizers which load inside object in  heap area at the time of object loadig process
	int b;
	static int c=30;
	//static inoitializers which load at the the time of class loading process

	public ObjectCreation() {
		// TODO Auto-generated constructor stub
		//this non  argument constructor
		super();
		//when we add no empty super call it call to object class constructor
	}

	public ObjectCreation(int a, int b) {
		this();
		//this call statement is used to achieve constructor chaining between same class.
		//we use this call or super call at a time not both at same time 
		this.a = a;
		this.b = b;
		//this is no-static reference variable which hold the reference of current object which is in currently execution
		//basically we use this at the time when local and global variable of same name and in-order to refer the object member.
		//this keyword hold the reference from every context which belong to same object.
		//this parameterized constructor which is used to load all the non static members of class inside object memory created in heap area
	}

	@Override
	public String toString() {
		return "ObjectCreation [a=" + a + ", b=" + b + "]";
	}
	
	public void display() {
		System.out.println("from super");
	}
}
