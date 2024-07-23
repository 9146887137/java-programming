package oops;

public class SingletTone {
	
	static SingletTone instance;
	static {
		instance=new SingletTone();
	}

	private SingletTone() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletTone getInstance() {
		if(instance==null) {
			instance=new SingletTone();
			System.out.println("instance created");
		}
		return instance;
	}

}
