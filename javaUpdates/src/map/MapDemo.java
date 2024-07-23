package map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> cm=new ConcurrentHashMap<Integer, String>();
		cm.put(1,"akash");
		cm.put(2,"ramesh");
		cm.put(3,"abhi");
		cm.put(4,"sumit");
		
		System.out.println(cm);
		System.out.println(ConcurrentHashMap.newKeySet());
		
		HashMap<Integer, String> sm=new HashMap<Integer, String>(cm);
		sm.put(null, null);
		sm.put(null, null);
		sm.put(7, null);
		System.out.println(sm.computeIfAbsent(9, (a)->sm.get(a).concat("Akash")));
		System.out.println(sm.keySet());
	}

}
