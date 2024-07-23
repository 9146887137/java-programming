package lamda;

public class MathableController {

	public static void main(String[] args) {
		
		Mathable math=new Mathable() {  //we cant create object of interface because interface doesnt have constructor
										//so interface follow internally inner class called annonymous class.
			//we use interface name to create annonymous class
			
			@Override
			public void sub(int a, int b) {
				System.out.println(a-b);
				
			}
			@Override
			public void mul(int a, int b) {
				System.out.println(a*b);
				
			}
			@Override
			public void divide(double a, double b) {
				System.out.println(a/b);
				
			}
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
				
			}
		};
		
		math.add(10, 3);
		math.sub(45, 34);
		math.mul(23, 7);
		math.divide(12, 4);
		System.out.println(math);
	}

}
