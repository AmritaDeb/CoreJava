package arrays;

import java.util.Arrays;

public class MissingNumbers {
	
	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 6, 7, 8, 9, 1 };
		for(int num : arr) {
			System.out.println(num);
		}
		Arrays.sort(arr);
		
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
