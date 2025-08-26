package string.duplicateCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersWithoutCount {

	public static void main(String[] args) {
		String input = "Programmmingp";
		
		// Using set
		
		Set<Character> actualSet = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(!actualSet.add(c)) {
				duplicate.add(c);
			}
		}
		
		System.out.println(duplicate);
		
		
		// Using map
		
		Map<Character, Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		
		for(char c : input.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}
		
		System.out.println(list);
	}

}
