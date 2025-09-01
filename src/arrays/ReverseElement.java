package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElement {

	public static void main(String[] args) {
		int[] numArray = {10,30,80,40,50,20,60,70};
		int[] reverseArray = new int[numArray.length];
		
		for(int i=0; i<numArray.length; i++) {
			reverseArray[i] = numArray[numArray.length-1-i];
		}
		// Way1 - using for loop :
		System.out.println("----------------------------");
		for (int i=0; i<reverseArray.length; i++) {
			System.out.println(reverseArray[i]);
		}
		System.out.println("Reversed array: " + Arrays.toString(reverseArray));
		
		// Way2 - using foreach loop :
		System.out.println("----------------------");
		for(int num : reverseArray) {
			System.out.print(num + " ");
		}
		System.out.println(" ");
		System.out.println("----------------------");
		
		//Way3 - using collection logic : 
		Integer[] arr = {10,30,80,40,50,20,60,70};
		
		// Convert to List
		List <Integer> list = Arrays.asList(arr);
		
		// Reverse the list
		Collections.reverse(list);
		
		System.out.println("Reversed array: " + Arrays.toString(arr));
		
		for(int i= numArray.length-1; i>=0; i--) {
			System.out.println(numArray[i]);
		}
	}

}
