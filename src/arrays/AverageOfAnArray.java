package arrays;

public class AverageOfAnArray {

	public static void main(String[] args) {
		int[] numArray = {10,30,80,40,50,20,60,70};
		int sum = 0 ;
		double average = 0 ;
		
		for(int i=0; i<numArray.length; i++) {
			sum += numArray[i];
		}
		average = sum / numArray.length;
		System.out.println("Average is : "+ average);
	}

}
