package number;

public class LargestNumber {
	
	public static int largestNumber(int num1, int num2) {
		int largeNumber = 0;
		if(num1 > num2) largeNumber = num1;
		else largeNumber = num2;	
		
		return largeNumber;
	}

	public static void main(String[] args) {
		System.out.println(largestNumber(500,499));
	}

}
