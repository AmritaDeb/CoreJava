package string.duplicateWords;

public class OccuranceOfOneWordInSentence {
	
	public static void main(String[] args) {
		
		String input = "the cat and the dog and the rat";		
		String[] words = input.toLowerCase().split(" ");
		int count = 0;
		
		for(String word : words) {
			if(word.equalsIgnoreCase("the")) {
				count++;
			}
		}
		System.out.println("Occurance of 'the' in input sentence is : " + count);
	}

}
