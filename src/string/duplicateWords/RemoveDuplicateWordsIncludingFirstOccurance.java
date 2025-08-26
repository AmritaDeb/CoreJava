package string.duplicateWords;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWordsIncludingFirstOccurance {

	public static void main(String[] args) {
		
		String input = "java is java and java is fun";
		String[] words = input.split(" "); 
		
		Set<String> set = new LinkedHashSet<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				set.add(entry.getKey());
			}
		}
		System.out.println(set);
	}

}
