package multithreading;

public class MultiThreadEx {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object removed by Garbage collector");
		super.finalize();
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		MultiThreadEx m=new MultiThreadEx();
		m=null;
		System.gc();
	}

}
