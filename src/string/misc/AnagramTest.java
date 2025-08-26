package string.misc;

import java.util.Arrays;

public class AnagramTest {
	
	public static boolean anagramCheck(String input1, String input2) {
		
		char[] arr1 = input1.toLowerCase().toCharArray();
		char[] arr2 = input2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean result = Arrays.equals(arr1, arr2);
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(anagramCheck("Silent", "Listen"));
		
		System.out.println(anagramCheck("Silemnt", "Listen"));

	}

}
