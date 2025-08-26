package string.vowelConsonant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsConsonantsUsingSet {

	public static void main(String[] args) {

		String str = "BetterButter";
        str = str.toLowerCase();

        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsSet.contains(c)) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
	}

}
 