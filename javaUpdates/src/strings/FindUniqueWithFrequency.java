package strings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueWithFrequency {

	public static void main(String[] args) throws IOException {
		
		String s="apple orange coconut apple apple banana orange pineapple apple coconut apple orange";
		Map<String, Long> f=Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy((fruit)->fruit,Collectors.counting()));
		System.out.println(f);
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		FileInputStream fin=new FileInputStream("D:\\chiku\\piu.jpg");
		FileOutputStream fout=new FileOutputStream("D:\\CV\\piu.jpg");
		StringBuilder sb=new StringBuilder();
		int data=fin.read();
		while (data!=-1) {
			if(data%2==0) {
				fout.write(data);
			}
			data=fin.read();
		}
		fout.close();
		fin.close();
	}

}
