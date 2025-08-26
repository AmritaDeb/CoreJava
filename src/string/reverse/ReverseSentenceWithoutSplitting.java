package string.reverse;

public class ReverseSentenceWithoutSplitting {
	
	public static void main(String[] args) {
		String input = "My Life My Rule";
		StringBuilder sbResult = new StringBuilder();
		
		char[] ch = input.toCharArray();
		
		int endIndex = ch.length;
		for(int i=ch.length-1; i>=0; i--) {
			if(ch[i] == ' ') {
				sbResult.append(input.substring(i+1, endIndex));
				sbResult.append(" ");
				endIndex = i;
			}
		}
		sbResult.append(input.substring(0, endIndex));

        System.out.println("Reversed Sentence: " + sbResult.toString());
	}

}
