package array;

public class EvenCharacter {

	public static void main(String[] args) {
		
		String s="ramesh is very dangerous guy";
		
		String s2="";
		for(String str:s.split(" ")) {
			if(str.charAt(0)%2==0) {
				char ch=str.charAt(0);
				s2+=str.replace(ch,++ch)+" ";
			}
			else {
				s2+=str+" ";
			}
		}
		System.out.println(s2);
	}

}
