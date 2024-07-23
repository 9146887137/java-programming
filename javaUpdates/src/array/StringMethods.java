package array;

public class StringMethods {

	public static void main(String[] args) {
		
//		String str="india";
//		String s1=str.concat("ramesh");
//		System.out.println(str);
//		System.out.println(s1);
		
		String s2=new String("hello india is my country");
//		s2.concat(str);
//		s2.replaceAll(s2, "Hello"); 
		//System.out.println(s2);
		String s1="";
		for(String s:s2.split(" ")) {
			s1+=s.substring(0, 1).toUpperCase()+s.substring(1)+" ";
		}
		System.out.println(s1);
		
	}

}
