package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleEx1 {

	public static void main(String[] args) throws IOException {
	
		
		//write the data to file
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("D:\\Akash\\welcome.txt");
		
		System.out.println("Emter date here:");
		String data=sc.nextLine();
		
		for(int i=0;i<data.length();i++) {
			fout.write(data.charAt(i));
		}
		
		fout.close();
	}

}
