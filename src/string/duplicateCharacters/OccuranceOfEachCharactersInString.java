package string.duplicateCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfEachCharactersInString {
	
	public static void main(String[] args) {
		String input = "Programming";
		
		// containsKey()
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: input.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet());		// [P=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1]
		
		
		
		// getOrDefault()
		
		Map<Character, Integer> map1 = new HashMap<>();
		
		for(char c : input.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(map1.entrySet());	// [P=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1]
	}

}
