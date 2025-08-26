package string.duplicateCharacters;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersWithCount {

	public static void main(String[] args) {
		String input = "BetterButter";
		
		Map<Character, Integer> duplicateMap = new HashMap<>();
		
		for(char c : input.toCharArray()) {
			duplicateMap.put(c, duplicateMap.getOrDefault(c, 0)+1);
		}
		
		System.out.println(duplicateMap);
		
		duplicateMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : duplicateMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}

}
