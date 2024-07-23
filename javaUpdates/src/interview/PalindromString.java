package interview;

public class PalindromString {

	public static void main(String[] args) {
		
		String s="nitin";
		System.out.println(s.equals(new String(new StringBuilder(s).reverse()))?"palindrom":"not palinrom");
		
		String s1=new String("akash");
		String s2=new String("akash"); //because the reference of every object is unique
		
		//inorder to compare two object based on its value override equals method which is already overrided in the String obj		
		
		
		System.out.println(s1==s2);
		
		
	}

}
