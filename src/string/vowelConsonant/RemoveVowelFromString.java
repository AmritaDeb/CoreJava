package string.vowelConsonant;

public class RemoveVowelFromString {
	
	public static void main(String[] args) {
		
		String input = "Programing";
		String result = "";
		
		// Way 1 :
		 
		for(char c : input.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					
				} else {
					result += c;
				}
			}
		}
		System.out.println("New string is : " + result);
		
		// Way 2 :
		
		result = "";
		result = input.replaceAll("[aeiouAEIOU]", "");
		System.out.println("New string is : " + result);
	}

}
