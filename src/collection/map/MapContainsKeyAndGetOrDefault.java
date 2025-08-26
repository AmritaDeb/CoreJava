package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyAndGetOrDefault {

	public static void main(String[] args) {
		String input = "BetterButter";

		/* 
		 * containsKey() - To check whether a key is present in a map
		 * returns boolean
		 */

		Map<Character, Integer> map = new HashMap<>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {			// 
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet()); 

		/*
		 * getOrDefault() - To check if the character already has a count 
		 * 1. If the character is already present, it returns its count.
		 * 2. If the character is not present, it returns the default value 0.
		 * Example:
		 * For first 'B': not present → returns 0
		 * For second 't': already present → returns its current count, say 1.
		 * */ 

		Map<Character, Integer> map1 = new HashMap<>();

		for (char c : input.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);		
		}

		System.out.println(map1.entrySet()); 
	}

}
