package multithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fd=new FileReader("E:\\python programs\\pyramid.py");
		BufferedReader br=new BufferedReader(fd);
		int b=br.read();
		while (b!=-1) {
			System.out.println(b);
		}
	}

}
