package string.vowelConsonant;

public class FirstVowelInString {

	public static void main(String[] args) {
		
		String input = "Programing";
		String firstVowel = "";
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					firstVowel += c;
					break;
				}
			}
		}
		System.out.println("First Vowel is : " + firstVowel);
	}

}
