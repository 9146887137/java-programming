package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fout=new FileOutputStream("D:\\Akash\\myObj.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Bike bk=new Bike("SP 125", "BS6", "Honda", 125, 112000);
		out.writeObject(bk);
		out.flush();
		out.close();
		
		FileInputStream fin=new FileInputStream("D:\\Akash\\myObj.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Bike deserilizable=(Bike)oin.readObject();
		System.out.println(deserilizable);
	}

}
