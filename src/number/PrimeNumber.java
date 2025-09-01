package number;

public class PrimeNumber {
	
	/*
	 * Example :
	 * num = 25 → divisible by 5 > not a prime
	 * num = 29 > is prime
	 * */
	
	public static boolean primeCheck(int num) {
	    if (num <= 1) {
	        return false; // 0, 1, and negatives are not prime
	    }
	    
	    for (int i = 2; i <= num / 2; i++) {
	        if (num % i == 0) {
	            return false; // found a divisor → not prime
	        }
	    }
	    return true; // no divisors → prime
	}
	
	public static void main(String[] args) {
		
		if(primeCheck(29)) System.out.println("It's a prime number");
		else System.out.println("It's not a prime number");
		
		if(primeCheck(25)) System.out.println("It's a prime number");
		else System.out.println("It's not a prime number");
		
		if(primeCheck(30)) System.out.println("It's a prime number");
		else System.out.println("It's not a prime number");
		
		if(primeCheck(31)) System.out.println("It's a prime number");
		else System.out.println("It's not a prime number");
	}

}
