package strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1=new String("akash");
		String s2=new String("akash");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//it compare references of both object and references are unique
		System.out.println(s1.equals(s2));//equals is overriden inside String it compare based on state
		
		String s3="rajesh";
		String s4="rajesh";
		System.out.println(s3==s4);//when we try to create object using String literal and if object is already present with given literal instead of creating object 
		//it will copy same ref inside variable
	}

}
