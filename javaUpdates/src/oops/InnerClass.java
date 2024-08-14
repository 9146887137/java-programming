package oops;

public class InnerClass {

	class A1{
		int a;
		int b;
		public A1(int a,int b) {
			this.a=a;
			this.b=b;
			System.out.println("A1");
		}
		
		public String hey() {
			System.out.println(a+b);
			return "hey";
		}
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		InnerClass class1=new InnerClass();
		Object c1=class1.clone();
		System.out.println(c1);
	}

}
