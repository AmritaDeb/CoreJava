package arrays;

public class DifferenceOfAnArray {

	public static void main(String[] args) {
		int[] numArray = {10,30,80,40,50,20,60,70};
		int result = 0 ;
		
		for (int i=0; i<numArray.length; i++) {
			result -= numArray[i];
		}
		System.out.println("Difference of Array :" + result);
	}

}
