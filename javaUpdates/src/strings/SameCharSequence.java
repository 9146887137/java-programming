package strings;

public class SameCharSequence {

	public static void main(String[] args) {
		
		String str="flower float floght flight";
		System.out.println(str!=""?getResult(str.split(" ")):"null");
		
	}
	public static String getResult(String[]ar) {
		if(ar!=null) {
			String s=ar[0];
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < ar.length; i++) {
				for (int j = 0; j < ar.length; j++) {
					if(s.charAt(i)!=ar[j].charAt(i)) {
						return sb.toString();
					}
				}
				sb.append(s.charAt(i));
			}
			return sb.toString();
		}
		return "";
	}

}
