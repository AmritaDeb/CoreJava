package wrapperClass.boxing;

public class TestBoxing1 {
	
	public static void main(String[] args) {
		int a = 10;
		Integer b = Integer.valueOf(a);	// boxing
		System.out.println(b);
		
		int a1 = 20;
		Integer b1 = a1;		// auto boxing
		System.out.println(b1);
	}

}
