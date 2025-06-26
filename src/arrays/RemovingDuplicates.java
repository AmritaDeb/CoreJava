package arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 2, 4, 1, 5};
		int[] temp = new int[numArray.length]; // To store unique elements only

		int index = 0; // Tracks how many unique elements are added
		boolean isDuplicate; // Flag to check if current element is a duplicate

		for (int i = 0; i < numArray.length; i++) {
			isDuplicate = false;

			// Check current element against all previously stored unique values
			for (int j = 0; j < index; j++) {
				if (numArray[i] == temp[j]) {
					isDuplicate = true; // Duplicate found
					break;
				}
			}
			// If no duplicate found, add to temp
			if (isDuplicate == false) {
				temp[index] = numArray[i];
				index++; // move to next insert position
			}
		}
		for (int k = 0; k < index; k++) {
			System.out.println(temp[k]);
		}
	}

}

/*
 * 1. i=0, index=0 => temp[0] = numArray[0] => temp[0] = 10 => index = 1 => j=0,
 * j<1 => => temp[0] == numArray[0]
 * 
 * 
 * 
 * 
 */
