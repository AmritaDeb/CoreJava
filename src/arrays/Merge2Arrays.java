package arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {60,70,80,90,100};
		
		int[] mergedArray = new int[array1.length + array2.length];
		
		for(int i=0; i<array1.length; i++) {
			mergedArray[i] = array1[i];
		}
		
		for (int i=0; i<array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}
		
		System.out.println("Merged 2 Arrays :");
		for(int i=0; i<mergedArray.length; i++) {
			System.out.println(mergedArray[i]);
		}

	}

}
