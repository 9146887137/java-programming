package interview;

public class ObjDemo {
	
	int a;
	int b;

	public ObjDemo() {
		// TODO Auto-generated constructor stub
	}
	

	public ObjDemo(int a,int b) {
		this.a=a;
		this.b=b;
		
		//this keyword is hold the reference of current obj which is currently under execution
		//and also this is parameterized  constructor which is used to load all the non static members inside the object and alsso initialize value into the 
	}
	
	public int add() {
		return a+b;
	}
	
	

}
