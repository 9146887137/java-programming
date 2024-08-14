package multithreading;

public class Thread2 extends Thread{

	public Thread2() {
		System.out.println("Thread Reff created..!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("hello garbage collector");
		super.finalize();
	}
	
	@Override
	public void run() {
		System.out.println(this.getName());
		
		for (int i = 0; i <10; i++) {
			System.out.println(getName()+" : "+i);
		}
	}

}
