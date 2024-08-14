package strings;

public class LongestRepetationChar {

	public static void main(String[] args) {
		
		String str="aabbbcdccccxxyyyyzaaaaa";
		
		int max=0;
		char ch=' ';
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					ch=str.charAt(i);
				}
				count=1;
			}
		}
		System.out.println(ch+" is longest repeated with "+max+" times");
	}

}
