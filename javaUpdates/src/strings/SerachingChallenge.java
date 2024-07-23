package strings;

public class SerachingChallenge {

	public static void main(String[] args) {
		
		String str="Hello apple pie";
		String token="82kjdz4ig16";
		
		System.out.println("hii");
		System.out.println(encrypt(searchChallenge(str)+token));
	}
	public static String searchChallenge(String str) {
		
		String[] s=str.split(" ");
		return str!="No Words"?s[0]:"-1";
	}
	public static String encrypt(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			sb.append((i+1)%4==0?"_":str.charAt(i));
		}
		return sb.toString();
	}

}
