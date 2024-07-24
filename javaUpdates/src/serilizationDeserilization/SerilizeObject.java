package serilizationDeserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerilizeObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fout=new FileOutputStream("D:\\serializable\\accountholder.txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		
		AccountHolder ac=new AccountHolder();
		ac.setName("Akash more");
		ac.setAcno(95458844572l);
		ac.setAddress("jalna");
		ac.setAdhar(590079362174l);
		ac.setAge(24);
		ac.setEmail("moreakash7892@gmail.com");
		ac.setGender("male");
		
		//its ObjectOutputStream class method using which we can write
		out.writeObject(ac);
		
		FileInputStream fin=new FileInputStream("D:\\serializable\\accountholder.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		AccountHolder deserialize=(AccountHolder)oin.readObject();
		System.out.println(deserialize);
	}

}
