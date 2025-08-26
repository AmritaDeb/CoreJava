package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Insertion order : 
 * - Maintains insertion order.
 * - Iterates elements in the same order as they were inserted.
 * */

public class LinkedHashMapInsertionOrderTest {
	
	public static void main(String[] args) {
		String input = "Competition";
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);				// {C=1, o=2, m=1, p=1, e=1, t=2, i=2, n=1}
		System.out.println(map.entrySet()); 	// [C=1, o=2, m=1, p=1, e=1, t=2, i=2, n=1]
	}

}
