package collection.map;

import java.util.Map;
import java.util.TreeMap;

/*
 * Insertion order : 
 * - Does NOT maintain insertion order.
 * - Instead, it keeps keys in sorted order.
 * */

public class TreeMapInsertionOrderTest {
	
	public static void main(String[] args) {
		String input = "Competition";
		Map<Character, Integer> map = new TreeMap<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);				// {C=1, e=1, i=2, m=1, n=1, o=2, p=1, t=2}
		System.out.println(map.entrySet()); 	// [C=1, e=1, i=2, m=1, n=1, o=2, p=1, t=2]
	}

}
