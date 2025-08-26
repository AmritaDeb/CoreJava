package collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Rules : 
 * 1. Can not have duplicate keys
 * 2. Can have duplicate values
 * 3. Can have null keys
 * 4. Can have null values
 * */

public class HashMapTest1 {
	
	public static void main(String[] args) {
		
		Map map1 = new HashMap();
		// isEmpty()
		System.out.println(map1.isEmpty());
		
		// put()
		map1.put(1, "Noodles");
		map1.put(2, "Momo");
		map1.put(3, "Roll");
		map1.put(4, "Pizza");
		System.out.println(map1);
		
		map1.put("Leela", 101);
		map1.put(null, "road");
		map1.put(5, null);
		System.out.println(map1);
		
		System.out.println(map1.isEmpty());
		System.out.println(map1.size());
		
	}

}
