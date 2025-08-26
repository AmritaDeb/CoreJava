package string.duplicateCharacters;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersExceptFirstOccurance {

	public static void main(String[] args) {
		
		String input = "Swisss";
		String result = "";
		
		Set<Character> set = new HashSet<>();
		Set<Character> actualSet = new HashSet<>();
		Set<Character> expectedSet = new LinkedHashSet<>();
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(actualSet.add(c)) {
				expectedSet.add(c);
			}
		}
		System.out.println(expectedSet);
		for(char s : expectedSet) {
			result += s;
		}
		System.out.println(result);
		
		
		// OR
		
		
		for(char c : input.toLowerCase().toCharArray()) {
			set.add(c);
		}
		System.out.println(set);
		
		result = "";
		for(char s : set) {
			result += s;
		}
		System.out.println(result);
	}

}
