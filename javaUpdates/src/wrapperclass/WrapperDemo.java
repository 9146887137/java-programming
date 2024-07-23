package wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i=10;
		
		//wrapper class is used to converting or storing primitive type of data into its r4spective object
	//	Integer i1=new Integer(i); //before jdk 1.5 we use this but from 1.5 its called auto boxing and auto-unboxing
		
		Integer i1=i;//this is called auto boxing
		i=i1;//auto unboxing
		
		//parshing
		//convert the primitive type data into string
		
		String con=String.valueOf(i);
		
		System.out.println(con.toString());//this method of object class which is overrided in the every wrapper classes
		//by default every class extend object class internally
		i=Integer.parseInt(con);
		//here we get one exception called NumberFormatException if string is not contains with only numbers
		System.out.println(i1);
		
		System.out.println("parsed:"+con);
		System.out.println("unparsed:"+i);
		
	}

}
