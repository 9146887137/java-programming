
import java.util.Arrays;
import java.util.Scanner;

public class problems {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int[]a=toBinary(sc.nextInt());
		System.out.println(Arrays.toString(a));
		int[]moved=move(a);
		System.out.println(Arrays.toString(moved));
		System.out.println(toNumber(moved));
		
		
	}
	public static int[] toBinary(int num) {
		int bit[]=new int[8];
		for(int i=bit.length-1;i>0;i--) {
			 bit[i]=num%2;
			 System.out.println(num+":"+num%2);
			 num/=2;
		}
		return bit;
	}
	public static int toNumber(int[] bit) {
		int res=128;
		int sum=0;
		for(int i=0;i<bit.length;i++) {
			if(bit[i]==1) {
				sum+=res;
			}
			res/=2;
		}
		return sum;
	}
	public static int[] move(int[]bit) {
		int f=0,l=bit.length/2;
		while(f<bit.length/2) {
			int temp=bit[f];
			bit[f++]=bit[l];
			bit[l++]=temp;
		}
		return bit;
	}
}
