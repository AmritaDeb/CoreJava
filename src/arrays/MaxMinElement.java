package arrays;

public class MaxMinElement {

	public static void main(String[] args) {
		int[] numArray = {10,30,80,40,50,20,60,70};
		int maxElement = numArray[0];
		int minElement = numArray[0];
		
		for(int i=0; i<numArray.length; i++) {
			if(maxElement < numArray[i]) {
				maxElement = numArray[i];
			} 
			
			if(minElement > numArray[i]) {
				minElement = numArray[i];
			}
		}
		System.out.println("Max array element is : " + maxElement);
		System.out.println("Min array element is : " + minElement);

	}

}
