package multithreading;

public class Thread1 extends Thread{

	static int a=10;
	@Override
	public void run() {
		System.out.println("h1");
		System.out.println(a=a*Thread3.a);
		this.setName("ramesh");
	}

}
class Thread3 extends Thread{
	
	static int a=20;
	@Override
	public void run() {
		System.out.println(a*Thread1.a);
		this.setName("akash");
	}
}