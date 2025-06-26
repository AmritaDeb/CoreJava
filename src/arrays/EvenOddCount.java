package arrays;

public class EvenOddCount {

	public static void main(String[] args) {
		int[] numArray = {10,33,80,45,50,20,69,70};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<numArray.length; i++) {
			if(numArray[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even count of an array is : " + evenCount);
		System.out.println("Odd count of an array is : " + oddCount);

	}

}
