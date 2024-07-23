package oops;


public class ObjDriver {
	static {
		System.out.println("from static at driver class");
	}

	public static void main(String[] args) {
		
		Object creation=new ObjectCreation(20, 40);  //constructor calling along with only new keyword we cant do it explicitly beacuase of new keyword create block 
		//of memory in which constructor load the non-static members
		System.out.println(creation.getClass());
		
		ObjectCreation ob=new SubClassEx();
	}

}
