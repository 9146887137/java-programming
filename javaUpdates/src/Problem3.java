import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int i=1;
		while(count>0) {
				int a=(3*i)+2;
				if(a%4!=0) {
					System.out.println(a);
					count--;
				}
				i++;
		}
	}
}
