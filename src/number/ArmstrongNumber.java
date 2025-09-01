package number;

public class ArmstrongNumber {
	
	public static boolean isArmstrongNumber(int num) {
		
		int originalNum = num;
		int result = 0;
		
		while (num > 0) {
			int digit = num % 10;
			result += Math.pow(digit, 3);
			num /= 10;
		}
		
		if(result == originalNum) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		if(isArmstrongNumber(153)) System.out.println("It's an armstrong number");
		else System.out.println("It's not an armstrong number");
		
		if(isArmstrongNumber(158)) System.out.println("It's an armstrong number");
		else System.out.println("It's not an armstrong number");
	}

}
