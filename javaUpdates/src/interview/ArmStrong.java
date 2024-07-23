package interview;

public class ArmStrong {

	public static void main(String[] args) {
		
		if(add(153)==153) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
	}
	public static int count(int num) {
		int ct=0;
		while(num!=0) {
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int add(int num) {
		int sum=0;
		int num1=num;
		
		while(num>0) {
			int pow=1;
			for(int i=0;i<count(num1);i++) {
				pow*=num%10;
			}
			
			sum+=pow;
			num/=10;
		}
		return sum;
	}

}
