package collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Insertion order : 
 * - Does NOT maintain insertion order.
 * - Iteration order is unpredictable and can change when rehashing happens.
 * */

public class HashMapInsertionOrderTest {

	public static void main(String[] args) {
		String input = "Competition";
		Map<Character, Integer> map = new HashMap<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);				// {p=1, C=1, t=2, e=1, i=2, m=1, n=1, o=2}
		System.out.println(map.entrySet()); 	// [p=1, C=1, t=2, e=1, i=2, m=1, n=1, o=2]
	}
}
