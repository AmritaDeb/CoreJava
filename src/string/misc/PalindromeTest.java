package string.misc;

public class PalindromeTest {
	
	public static boolean palindromeCheck(String input) {
		String result = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			result += input.charAt(i);
		}
		
		if(result.equalsIgnoreCase(input)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String[] inputArr = {"Madam", "Egg", "level"};
		
		for(String input : inputArr) {
			if(palindromeCheck(input)) {
				System.out.println(input + " is a palindrome");
			} else {
				System.out.println(input + " is not a palindrome");
			}
		}
	}

}
