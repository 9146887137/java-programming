package oops;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Bike> h=new HashSet<Bike>();
		h.add(new Bike("bullet 350", "bs6", "royal enfield",125,345000));
		h.add(new Bike("shine", "bs6", "honda",125,95000));
		h.add(new Bike("hfdelux", "bs4", "hero",125,98000));
		h.add(new Bike("rx100", "bs6", "bajaj",125,91000));
		h.add(new Bike("unicorn", "bs6", "honda",125,145000));
		h.add(new Bike("bullet 350", "bs6", "royal enfield",125,345000));
		h.add(new Bike("rx100", "bs4", "bajaj",125,90000));
		h.add(new Bike("rx100", "bs6", "bajaj",125,90000));
		
		
		
		TreeSet<Bike> tr=new TreeSet<Bike>(h);
		//System.out.println("tr");
		for(Bike b:tr) {
			System.out.println(b);
		}
	}
	

}
