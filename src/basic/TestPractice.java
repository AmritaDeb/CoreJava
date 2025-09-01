package basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestPractice {
	
	public static boolean primeCheck(int num) {
		boolean isPrime = false;
		
		if(num<=1) {
			isPrime = false;
		}
		
		System.out.println(Math.sqrt(num));
		
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		
		
		System.out.println(primeCheck(29));
		System.out.println(primeCheck(30));
	}

}
