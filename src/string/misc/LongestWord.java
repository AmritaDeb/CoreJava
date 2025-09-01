package string.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestWord {

	public static String findLongestWord(String input) {
		String[] words = input.split(" ");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

	public static List<String> findLongestWords(String input) {

		String[] words = input.split(" ");
		List<String> longestWordsList = new ArrayList<>();
		int maxLength = 0;

		for (String word : words) {
			if (word.length() > maxLength) {
				longestWordsList.clear();
				maxLength = word.length();
				longestWordsList.add(word);
			} else if (word.length() == maxLength) {
				longestWordsList.add(word);
			}
		}
		return longestWordsList;
	}

	public static Map<String, Integer> findLongestWordsWithCount(String input) {

		String[] words = input.split(" ");
		Map<String, Integer> longestWordsMap = new HashMap<>();
		int maxLength = 0;

		for (String word : words) {
			if (word.length() > maxLength) {
				longestWordsMap.clear();
				maxLength = word.length();
				longestWordsMap.put(word, word.length());
			} else if (word.length() == maxLength) {
				longestWordsMap.put(word, word.length());
			}
		}
		return longestWordsMap;
	}

	public static void main(String[] args) {

		String input1 = "Java is an highlevel programing language";
		String longestWord = findLongestWord(input1);
		System.out.println("Longest Word is : " + longestWord);
		System.out.println("Length of the word " + longestWord + " is : " + longestWord.length());

		String input2 = "Java is an highlevel opensource programing language";
		System.out.println("Longest words list :" + findLongestWords(input2));
		System.out.println("Longest words with their length :" + findLongestWordsWithCount(input2));
	}

}
