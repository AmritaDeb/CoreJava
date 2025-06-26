package arrays;

// array is a continuous block of memory which is used to store homogeneous values
// in java, array is an object of type array ( type[] )
// 2 ways to create array object
// specifying the size of the array during the array declaration is mandatory

public class ArrayObjectCreation {

	public static void main(String[] args) {
		
		// Way 1 : using new keyword
		int[] a = new int[4];
		
		// Way 2 : by initializing the reference variable using {}
		int[] b = {10,20,30,40,50};
		
		// default value 0 will be initialized to elements of array during object creation
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// ArrayIndexOutOfBoundsException
		System.out.println(a[5]);		// Index 5 out of bounds for length 5
		System.out.println(b[-1]);		// Index -1 out of bounds for length 6

	}

}
