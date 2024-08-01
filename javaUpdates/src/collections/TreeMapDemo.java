package collections;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		NavigableMap<Integer, String> tMap=new TreeMap<Integer, String>();
		tMap.put(1, "akash");
		tMap.put(3, "sham");
		tMap.put(2, "ram");
		tMap.put(12, "umesh");
		tMap.put(10, "radha");
		
		System.out.println(tMap);
		
		for(Integer i:tMap.descendingKeySet()) {
			System.out.println(tMap.get(i));
		}
	}

}
