package string.reverse;

public class ReverseStringAndWordsTogether {
	
	public static void main(String[] args) {
		String input = "I love Java";
		String result = "";
		
		String[] words = input.split(" ");
		
		// charAt()
		
		for(int i=words.length-1; i>=0; i--) {
			for(int j=words[i].length()-1; j>=0; j--) {
				char c = words[i].charAt(j);
				result += c;
			}
			result += " ";
		}
		System.out.println(result);
		
		// append()
		
		StringBuilder sbResult = new StringBuilder();
		
		for(int i= words.length-1; i>=0; i--) {
			String resString = new StringBuilder(words[i]).reverse().toString();
			sbResult.append(resString);
			sbResult.append(" ");
		}
		System.out.println(sbResult);
	}

}
