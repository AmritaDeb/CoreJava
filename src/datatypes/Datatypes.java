package datatypes;

public class Datatypes {
	
	// A datatype is used to define the type of the data that a variable can store
	// Type of datatype in java, 
	
	// 1. Primitive Data Types (Store simple values)
	// 2. Non-Primitive Data Types (Store complex objects)
	
	// There are 8 primitive datatypes in java
			// boolean > 1bit > false
			// byte > 1 byte(2bits) > 0
			// short > 2 bytes > 0
			// int > 4 bytes > 0
			// long > 8 bytes > 0l
			// float > 4 bytes > 0.0f
			// double > 8 bytes > 0.0d
			// char > 2 bytes > '\u0000'
	
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;
	
	public static void main(String[] args) {
		
		
		System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
		
		b = 10;
        s = 100;
        i = 1000;
        l = 10000L;
        f = 10.5f;
        d = 20.5;
        c = 'A';
        bool = true;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        
        double count = 20.0;
        
        int countInt = (int) count;
        String str = Integer.toString(countInt);
        System.out.println(str);
	}
	

}
