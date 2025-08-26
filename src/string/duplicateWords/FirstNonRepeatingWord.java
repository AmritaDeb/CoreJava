package string.duplicateWords;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord {

	public static void main(String[] args) {
		String input = "big black bug bit a big black dog";
		String[] words = input.split(" ");
		
		Map<String, Integer> actualMap = new LinkedHashMap<>();
		
		for(String word : words) {
			actualMap.put(word, actualMap.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : actualMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First Non Repeating Word is : " + entry.getKey());
				break;
			}
		}
	}

}
