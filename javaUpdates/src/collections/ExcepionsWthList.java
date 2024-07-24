package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ExcepionsWthList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,40,56,78,34,45,78,90,null,78);
		try {
			//list.add(30);
			//list.remove(1);
			Collections.sort(list);
			
			Iterator<Integer> iterator=list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				//list.remove(iterator.next());
			}
			System.out.println(iterator.next());
			
			
		} catch (UnsupportedOperationException o) {
			System.out.println("we cant add element at the time when we crete list with Arrays.asList");
		}
		catch (NullPointerException e) {
			System.out.println("cant comapre with null as reference");
		}
		catch (NoSuchElementException e) {
			System.out.println("when we try to access cursor point where no any element present");
		}
	}

}
