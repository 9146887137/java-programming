package stringTokenizer;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StrToken {

	public static void main(String[] args) {
		
	String s="india is my country";
	StringTokenizer st=new StringTokenizer(s);
	Iterator<Object> it=st.asIterator();
	
	while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
	}
	
}
