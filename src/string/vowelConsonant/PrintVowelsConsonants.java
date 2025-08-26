package string.vowelConsonant;

import java.util.ArrayList;
import java.util.List;

public class PrintVowelsConsonants {
	
	public static void main(String[] args) {
		
		String input = "Automation";
		
		List<Character> vowelList = new ArrayList<>();
		List<Character> consonantList = new ArrayList<>();
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelList.add(c);
				} else {
					consonantList.add(c);
				}
			}
		}
		System.out.println("Vowel List is " + vowelList);
		System.out.println("Consonant List is " + consonantList);
	}

}
