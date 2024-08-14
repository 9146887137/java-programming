package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class ExploreColleection {

	public static void main(String[] args) {
		
		HashSet<array.Student> hash=new HashSet<array.Student>();
		hash.add(new array.Student("Akash", 23));
		hash.add(new array.Student("sham", 26));
		hash.add(new array.Student("pawna", 22));
		hash.add(new array.Student("Akash", 23));
		hash.add(new array.Student("Ramesh",27));
		
		//System.out.println(hash.removeIf((a)->a.age>25));
		Iterator<array.Student> it=hash.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------------");
		
		Comparator<array.Student> com=((a,b)->a.age>b.age?1:a.age<b.age?-1:0);
		NavigableSet<array.Student> tr=new TreeSet<array.Student>(com);
		tr.addAll(hash);
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr.descendingSet());
		System.out.println(tr.);
		/*with the help of that set we can navigate the object easily
		 * it will provisd me the some features
		 * pollfirt,polllast,last,first,ceilling,floor,tailset,headset,descendingset,descendingIteraator,subset,lower,higher*/
	}

}
