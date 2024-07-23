package array;

import java.lang.management.MemoryUsage;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		String str="akash sumit abhi krishna shubham aditya";
		StringTokenizer st=new StringTokenizer(str);
		
		System.out.println(st);
		List<String> list=new ArrayList<String>();
		
		while(st.hasMoreTokens()) {
			list.add(new String(new StringBuilder(st.nextToken()).reverse()));
		}
		//System.out.println(list.stream().sorted().map((ele)->new StringBuilder(ele).reverse()).filter((ele)->isPrime(ele.charAt(ele.length()-1))).toList());
		
		System.out.println(list.stream().map((ele)->new StringBuilder(ele).replace(0, 0, String.valueOf(ele.charAt(0)).toUpperCase())).toList());
		
		String str1=new String("akash");
		Object obj=str1.replaceAll(str1, "ramesh");
		//System.out.println(obj);
		
		MemoryUsage mu=new MemoryUsage(12, 56, 89, 678);
		System.out.println(mu.getInit());
		
		ClassLoader cl=new ClassLoader(){
		};
		System.out.println(cl.getName());
		
	}
	public static boolean isPrime(char ch) {
		for(int i=2;i<ch;i++) {
			if(ch%i==0) {
				return false;
			}
		}
		return true;
	}

}
