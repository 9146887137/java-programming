package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout=new FileOutputStream("E:\\filehandling\\first.txt");
		
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		for(int i=0;i<s.length();i++) {
			fout.write(s.charAt(i));
		}
		fout.close();//close the stream
	}
	public void hey() {
		System.out.println("hii bro");
		System.out.println(this);
	}

}
