package multithreading;

public class Thread1 extends Thread{

	@Override
	public void run() {
		
		System.out.println("from thread:"+this.getName());
	}

}
