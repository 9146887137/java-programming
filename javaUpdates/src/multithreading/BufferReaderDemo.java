package multithreading;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("E:\\java practice\\MyFamily.java");
		FileWriter fw=new FileWriter("E:\\\\java practice\\\\MyFamily.java");
		
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		
		int i;
		while ((i=br.read())!=-1){
			bw.write((char)i);
		}
		fr.close();
	}

}
