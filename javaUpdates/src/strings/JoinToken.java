package strings;

public class JoinToken {

	public static void main(String[] args) {
		
		String str="aaabccleezvv";
		String token="4ymlst47gh789";
		
		System.out.println(frequency(str));
	}
	public static String frequency(String str) {
		
		int count=1;
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<str.length();i++) {
			char ch=str.charAt(i);
			char ch1=str.charAt(i-1);
			if(i==str.length()||ch1!=ch) {
				sb.append(count).append(ch1);
				count=1;
			}
			else {
				count++;
			}
		}
		
		return sb.toString();
	}

}
