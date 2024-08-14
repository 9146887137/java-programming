package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyToAnother {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\Akash\\welcome.txt");
		FileOutputStream fout=new FileOutputStream("D:\\Akash\\weldone.txt");
		
		int data=fin.read();
		
		while(data!=-1) {
			if(data%2==0) {
				fout.write(data);
			}
			data=fin.read();
		}
		fin.close();
		fout.close();
	}
}
