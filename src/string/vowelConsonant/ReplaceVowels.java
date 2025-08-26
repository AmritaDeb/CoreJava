package string.vowelConsonant;

public class ReplaceVowels {
	
	public static void main(String[] args) {
		
		String input = "Programing";
		String result = "";
		
		// way 1:
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					result += '*';
				} else {
					result += c;
				}
			}
		}
		System.out.println("After replacing vowels: " + result);		// pr*gr*m*ng
		
		// way 2:
		
		result = "";
		result = input.replaceAll("[aeiouAEIOU]", "*");
		
		System.out.println("After replacing vowels: " + result); 		// Pr*gr*m*ng
	}

}
