package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Rules : 
 * 1. Can not have duplicate keys
 * 2. Can have duplicate values
 * 3. Can have null keys
 * 4. Can have null values
 * */

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		if(map1.isEmpty()) {
			map1.put(1, "Noodles");
			map1.put(2, "Momo");
			map1.put(3, "Roll");
			map1.put(4, "Pizza");
		}
		System.out.println("Map1 : "+ map1);
		map1.put(4, "Cheese" + map1.get(4));
		System.out.println("Map1 : "+ map1);
		
		Map<Integer, String> map2 = new HashMap<>();
		if(map2.isEmpty()) {
			map2.put(5, "Dosa");
			map2.put(6, "Idli");
		}
		System.out.println("Map2 : "+ map2);
		
		// putAll()
		map1.putAll(map2);
		System.out.println("Map1 : "+ map1);
		
		// size()
		System.out.println("Size of Map1: " + map1.size());
		
		// containsKey()
		System.out.println(map1.containsKey(10));
		System.out.println(map1.containsKey(5));
		
		// containsValue()
		System.out.println(map2.containsValue("Roll"));
		System.out.println(map2.containsValue("Idli"));
		
		// get()
		System.out.println(map1.get(3));
		
		// keySet()
		Set<Integer> keyset = map1.keySet();
		System.out.println("Keys : "+ keyset);
		
		// values()
		Collection<String> values = map1.values();
		System.out.println("Values : "+ values);
		
		// equals() and remove()
		if(map1.get(3).equals("Roll")) {
			map1.remove(3);
		}
		System.out.println("Map1 : "+ map1);
		
		// entrySet(), getKey(), getValue()
		Set<Map.Entry<Integer, String>> set = map1.entrySet();
		System.out.println("Entry set : " + set);
		
		for(Map.Entry<Integer, String> i : map1.entrySet()) {
			System.out.println("Key : " + i.getKey() + ", Value : " + i.getValue());
		}
		
		// clear()
		map1.clear();
		System.out.println("Map1 : "+ map1);
		
	}

}
