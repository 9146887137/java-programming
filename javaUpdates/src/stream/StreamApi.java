package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> i=Arrays.asList(48,67,89,90,34,23,545,78,90,23);
		System.out.println(i);
		List<Integer> evenlist=i.parallelStream().dropWhile((ele)->ele%2==0).toList();
		//dropwhile method is method of stream which is used to drop the the element from given stream according to predicate
		System.out.println(evenlist);
		
	List<Integer> map=evenlist.stream().map((ele)->ele+1).toList();
	//map is the method of stream which is used to apply the some functionality to method
	
	System.out.println(map);
	
	System.out.println(map.stream().anyMatch((ele)->ele==24)? "element present":"element not present");
	//anymatch is method of stream class which is return  boolean value according to predicate
	
	System.out.println(i.stream().findAny().get());//this is  used to find anny element randomly
	
	System.out.println(i.stream().findAny().get());//this is  used to find anny element randomly
		
		
	}

}
