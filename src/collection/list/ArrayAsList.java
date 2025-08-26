package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	
	public static void main(String[] args) {
		
		List<Character> vowelList = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		
		String input = "Javaa";
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(char c : input.toCharArray()) {
			if(vowelList.contains(c)) {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonantCount);
	}

}
