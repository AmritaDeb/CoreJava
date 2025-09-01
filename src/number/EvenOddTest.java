package number;

public class EvenOddTest {
	
	public static boolean checkEvenOdd(int num) {
		
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		if(checkEvenOdd(50)) System.out.println("It's a even number");
		else System.out.println("It's a odd number");
		
		if(checkEvenOdd(5)) System.out.println("It's a even number");
		else System.out.println("It's a odd number");
		
		if(checkEvenOdd(35)) System.out.println("It's a even number");
		else System.out.println("It's a odd number");
		
	}

}
