package multithreading;

import java.util.Arrays;

public class ThreadDemo {
	
	protected void finalize() throws Throwable {
		System.out.println("garbage ");
		System.out.println(Thread.currentThread().getName());
		super.finalize();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1=new Thread1();
		Thread3 t3=new Thread3();
		Thread4 t4=new Thread4();
		t1.start();
		t3.start();
		t4.start();
		System.out.println("Id:"+t4.getId());
		//t1.setPriority(11); when we try to set the thread priority greater  or less than min priority than max priority then we get
		//IllegleArgumentException
		System.out.println(t1.isInterrupted());
	}

}
