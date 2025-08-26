package string.duplicateCharacters;

public class OccuranceOfOneCharacterInString {
	
	public static void main(String[] args) {
		String input = "Competition";
		int count = 0;
		
		for(char c : input.toCharArray()) {
			if(c == 't') {
				count++;
			}
		}
		System.out.println("Occurance of 't' in 'Competition' is : "+ count);
	}

}
