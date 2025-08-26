package string.duplicateWords;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachWordsInSentence {
	
	public static void main(String[] args) {
		String input = "A big black bug bit a big black dog";	
		String[] words = input.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		
		// getOrDefault()
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		System.out.println(map.entrySet());
		
		// containsKey()
		
		for(String word : words) {
			if(map1.containsKey(word)) {
				map1.put(word, map.get(word)+1);
			} else {
				map1.put(word, 1);
			}
		}
		System.out.println(map1.entrySet());
	}

}
