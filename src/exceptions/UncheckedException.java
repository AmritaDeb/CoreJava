package exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		
		try {
			int i = 10 / 0; // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by 0");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
	}

}
