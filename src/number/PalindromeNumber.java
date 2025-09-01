package number;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int reverseNum = 0;
		
		while(num>0) {					// 532
			int digit = num % 10;		// 2
			reverseNum = reverseNum * 10 + digit;
			num /= 10;
		}
		
		if(originalNum == reverseNum) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		if(isPalindrome(535)) System.out.println("It's a palindrome");
		else System.out.println("It's not a palindrome");
		
		if(isPalindrome(532)) System.out.println("It's a palindrome");
		else System.out.println("It's not a palindrome");
	}

}
