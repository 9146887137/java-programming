package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineInputUsingBufferReader {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(reader);
		
		String s=bufferedReader.readLine();
		
		System.out.println("Hello "+s);
	}

}
