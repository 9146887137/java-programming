package array;

import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		System.out.println(toBinary(num));
	}
	public static String toBinary(int num) {
		
		StringBuilder sb=new StringBuilder();
		while (num>0) {
			sb.insert(0, num%2);
			num=num/2;
		}
		return sb.toString();
	}
	

}
