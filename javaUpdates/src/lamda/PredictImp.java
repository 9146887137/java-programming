package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class PredictImp {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(78,4,5,3,5,7,8,9,7,6,5,7,8,0,0,7);
		System.out.println(list);
		
		Predicate<Integer> pr=(obj)->obj %2==0;
		for(Integer i:list) {
			System.out.println(pr.test(i)?i:0);
		}
		
		ListIterator<Integer> l=list.listIterator();
		
		while (l.hasNext()) {
			list.remove(l.next());
			
		}
		
	}

}
