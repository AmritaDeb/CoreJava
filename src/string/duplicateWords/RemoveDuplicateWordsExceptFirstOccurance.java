package string.duplicateWords;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsExceptFirstOccurance {

	public static void main(String[] args) {
		
		String input = "java is java and java is fun";
		String[] words = input.split(" "); 
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String word : words) {
			set.add(word);
		}
		System.out.println(set);
	}

}
