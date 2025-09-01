package number;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 10; int a = 0; int b = 1;
		
		for(int i=1; i<=range; i++) {
			System.out.print(a + " ");
			int sum = a+b;
			a = b;
			b = sum;
		}
		
	}

}
