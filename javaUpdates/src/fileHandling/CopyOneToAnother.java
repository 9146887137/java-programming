package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyOneToAnother {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("E:\\filehandling\\first.txt"); //read the data from first file
		FileOutputStream fout=new FileOutputStream("E:\\filehandling\\second.txt"); //write data into another file
		
		int data=fin.read();
		while(data!=-1) {
			if(data%2==0) {
				fout.write(data);
			} //store it into string variable 
			
			
			data=fin.read();
		}
		
		fin.close();
		fout.close();
	}

}
