package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		
		
		HashMap<String, List<String>> mp1=new HashMap<String, List<String>>();
		mp1.put("tejash",Arrays.asList("akash","abhi","shubham","sumit","aditya","krishna","rahjesh"));
		mp1.put("rajath",Arrays.asList("akash","abhi","shubham","sumit","aditya","krishna","rahjesh"));
		
		List<String> tejas=mp1.get("tejash");
		
		for(String s:tejas) 
		{
			System.out.println(s);
		}
		
	}

}
