package string.reverse;

public class ReverseEachWordInSentence {
	
	public static void main(String[] args) {
		
		String input = "I love Java";
		String result = "";
		StringBuilder sbResult = new StringBuilder();
		
		String[] words = input.split(" ");
		
		// charAt()
		
		for(int i=0; i<words.length; i++) {
			for(int j=words[i].length()-1; j>=0; j--) {
				char c = words[i].charAt(j);
				result += c;
			}
			result += " ";
		}
		System.out.println(result);
		
		// append()
		
		for(String word : words) {
			String resultSring = new StringBuilder(word).reverse().toString();
			sbResult.append(resultSring);
			sbResult.append(" ");
		}
		
		System.out.println(sbResult);
	}

}
