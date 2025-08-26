package string.reverse;

public class ReverseString {
	
	public static void main(String[] args) {
		String input = "amrita";
		String result1 = "";
		String result2 = "";
		
		// using charAt()
		
		for(int i = input.length()-1; i>=0; i--) {
			char c = input.charAt(i);		
			result1 += c;
		}
		System.out.println(result1);
		
		// using toCharArray()
		
		char[] ch = input.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			result2 += ch[i];
		}
		System.out.println(result2);
	}

}
