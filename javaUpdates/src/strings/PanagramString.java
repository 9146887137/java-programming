package strings;

public class PanagramString {

	public static void main(String[] args) {
		
		String s="aabbczzzue";
		String token="4ymuezu0p358";
		System.out.println(encrypt(findFrequency(s)+token));
	}
	public static String findFrequency(String str) {
		StringBuilder sb=new StringBuilder();
		int count=1;
		
		for(int i=1;i<str.length();i++) {
			if(i==str.length()||str.charAt(i)!=str.charAt(i-1)) {
				sb.append(count).append(str.charAt(i-1));
				count=1;
			}
			else {
				count++;
			}
		}
		return sb.toString();
	}
	public static String encrypt(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			sb.append((i+1)%4==0?"_":str.charAt(i));
		}
		return sb.toString();
	}

}
