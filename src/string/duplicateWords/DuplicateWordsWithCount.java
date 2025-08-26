package string.duplicateWords;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsWithCount {

	public static void main(String[] args) {
		
		String input = "A big black bug bit a big black dog";		
		String[] words = input.toLowerCase().split(" ");
		
		Map<String, Integer> map = new HashMap<>();
				
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}

}
