package string.vowelConsonant;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		String input = "Java Programming";
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		
		System.out.println("Vowel count is : " + vowelCount);
		System.out.println("Consonant count is : " + consonantCount);
	}

}
