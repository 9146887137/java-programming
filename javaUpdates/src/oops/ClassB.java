package oops;

public class ClassB implements InterfaceA{
	static{
		System.out.println("static block");
		/*
		 * this is static block which get execute at the time of class loading process*/
	}
	{
		System.out.println("non static block");
		//this is non static block which get execute at the time of object loading process
		//at the loading time it execute all the initializers first its also non static initializers
		//this is an instance block which help me to create instance
		System.out.println(this);
	}

	public ClassB() {
		System.out.println("constructor");
		// TODO Auto-generated constructor stub
		/*
		 * the work of constructor is load all the non static variables or non static method inside object memory
		 * new keyword create block of memory inside heap area after that constructor get called.
		 * first frame created of constructor inside stack area after that it load all the members of object 
		 * constructor is one member of class but we cant call it explicitly it call automatically when we try to create instance of object
		 * we use constructor along with only new keyword
		 * every non static member contains its object reference thats why we can use any non-static member inside any non static member*/
	}
	public static void sta() {
		System.out.println("static method");
	}
	public void sub(){
		System.out.println("override inside class B");
		
	}
	
	public void add() {
		System.out.println("add from class B");
		sub();
		//InterfaceA.super.add();
	}

}
