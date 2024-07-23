package multithreading;

public class ThreadController {
	
	static {
		Thread main=Thread.currentThread();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread.yield();
		Thread1 t1=new Thread1();
		t1.setName("thread1");
		//t1.run();
		
		Thread1 t2=new Thread1();
		t2.setName("thread2");
		
		
		Thread1 t3=new Thread1();
		t3.setName("thread3");
		t1.start();
		Thread.sleep(1000);
		t2.start();
		t3.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
			System.out.println(Thread.currentThread());
		}
	}

}
