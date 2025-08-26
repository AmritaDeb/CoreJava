package wrapperClass.unboxing;

public class TestUnboxing1 {
	
	public static void main(String[] args) {
		Integer a = 10;
		int b = a.intValue();		// Unboxing
		System.out.println(b);
		
		Integer a1 = 20;
		int b1 = a1;		// Auto unboxing
		System.out.println(b1);
	}

}
