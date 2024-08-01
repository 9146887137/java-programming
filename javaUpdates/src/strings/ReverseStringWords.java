package strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		
		String str="house of dragon";
		System.out.println(reveseWord(str));
	}
	public static String reveseWord(String str) {
		
		StringBuilder sb=new StringBuilder();
		String[] ar=str.split(" ");
		
		for(String s:ar) {
			for (int i = s.length()-1; i >=0; i--) {
				sb.append(s.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
		return new String(sb);
	}

}
