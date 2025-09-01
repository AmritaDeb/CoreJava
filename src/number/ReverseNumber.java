package number;

public class ReverseNumber {
	
	public static int reverseNumber(int num) {
		int reverseNum = 0;
		
		while(num>0) {					// 532
			int digit = num % 10;		// 2
			reverseNum = reverseNum * 10 + digit;
			num /= 10;
		}
		
		return reverseNum;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(532));
	}

}
