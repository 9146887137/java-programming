package patternandnumber;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=153;
		System.out.println(checkArmstrong(n)?"armstrong":"not armstrong");
		
	}
	public static int count(int num) {
		return String.valueOf(num).length();
	}
	public static int power(int rem,int count) {
		int pow=1;
		for(int i=0;i<count;i++) {
			pow*=rem;
		}
		return pow;
	}
	public static boolean checkArmstrong(int num) {
		int n=num;
		int sum=0;
		while (n!=0) {
			sum+=power(n%10,count(num));
			n/=10;
		}
		return sum==num;
	}
}
