package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddCustomObjectwithSorting {

	public static void main(String[] args) {
		
		
		List<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(new Laptop("victus", "Dell", 8, 256, 56000));
		laptops.add(new Laptop("Latitude 131", "Dell", 12, 512, 82000));
		laptops.add(new Laptop("pavillion", "HP", 8, 256, 58000));
		laptops.add(new Laptop("Acer 142", "Acer", 4, 256, 40000));
		laptops.add(new Laptop("Latitude 178", "Dell", 8, 256, 57000));
		laptops.add(new Laptop("macbook pro", "Apple", 0, 256, 156000));
		
		System.out.println(laptops);
		
		//we can sort custom object in following way
		/*1.Collections class method
		 * 2.stream*/
		
		//if we want to sort custom objects but using before this method we have to make my object as comparable type
		//1 implements Comparable
		//2.implements Comparator
		Collections.sort(laptops);
		System.out.println(laptops);
		
		
		//we use comparator outside the class because it accept two object means there is no need to current object
		//but comparator compare given object with current object
		
		Comparator<Laptop> com=(a,b)->a.ram>b.ram?1:a.ram<b.ram?-1:0;
		laptops.sort(com);
		System.out.println(laptops);
		
		
		//using stream
		List<Laptop> sorted=laptops.stream().sorted().toList();
		List<Laptop> comp=laptops.stream().sorted((a,b)->a.rom>b.rom?1:a.rom<b.rom?-1:0).toList();
		System.out.println(sorted);
		System.out.println(comp);
	}

}
