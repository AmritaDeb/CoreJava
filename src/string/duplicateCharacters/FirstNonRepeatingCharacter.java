package string.duplicateCharacters;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "Swisss";
		
		Set<Character> expectedSet = new LinkedHashSet<>();
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : input.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				expectedSet.add(entry.getKey());
			}
		}
		
		System.out.println(expectedSet);
		for(char result : expectedSet) {
			System.out.println("First Non Repeating Character is : " + result);
			break;
		}
	}

}
