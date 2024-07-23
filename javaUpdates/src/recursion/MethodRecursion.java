package recursion;

public class MethodRecursion {

	public static void main(String[] args) {
		
		int a=5;
		System.out.println(factorial(a));
		System.out.println(square(a));
	}
	public static int factorial(int a) {
		if(a==0) {
			return 1;
		}
		return a*factorial(a-1);
	}
	
	public static int square(int num) {
		if(num==0) {
			return 0;
		}
		return square(num-1)+(2*num)-1;
	}

}
