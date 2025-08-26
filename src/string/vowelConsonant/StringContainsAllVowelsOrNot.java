package string.vowelConsonant;

public class StringContainsAllVowelsOrNot {

	public static void main(String[] args) {

		String input = "aeiou";
		input = input.toLowerCase();

		boolean allVowel = input.contains("a") && input.contains("e") && input.contains("i") && input.contains("o")
				&& input.contains("u");
		if(allVowel)
			System.out.println("Contains all vowels");
		else 
			System.out.println("Does not contain all vowels");

	}

}
