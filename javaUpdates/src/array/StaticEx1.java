package array;

public class StaticEx1 {
	
	static {
		System.out.println("from static block");
	}
	
	static int a=20;

	public StaticEx1() {
		System.out.println("from constructor");
	}
	
	static void display() {
		System.out.println("from non static");
	}

}
class Stat2 extends StaticEx1{
	
	static {
		System.out.println("from sub counstructor");
	}
	
}

