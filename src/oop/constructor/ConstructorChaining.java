package oop.constructor;

class SuperClass {
	
	SuperClass(){
		System.out.println("SuperClass Zero Arg Constructor Called..");
	}
	
	SuperClass(int a) {
		this();
		System.out.println("SuperClass Constructor with 1 parameter Called..");
	}

	SuperClass(int a, int b) {
		this(10);
		System.out.println("SuperClass Constructor with 2 parameters Called..");
	}

	SuperClass(int a, int b, int c) {
		this(10,20);
		System.out.println("SuperClass Constructor with 3 parameters Called..");
	}
}

class SubClass extends SuperClass {
	
	SubClass(){
		super(10,20,30);
		System.out.println("SubClass Zero Arg Constructor Called..");
	}

	SubClass(int a) {
		this();
		System.out.println("SubClass Constructor with 1 parameter Called..");
	}

	SubClass(int a, int b) {
		this(10);
		System.out.println("SubClass Constructor with 2 parameters Called..");
	}

	SubClass(int a, int b, int c) {
		this(10, 20);
		System.out.println("SubClass Constructor with 3 parameters Called..");
	}

}

public class ConstructorChaining {
	public static void main(String[] args) {
		SubClass sub = new SubClass(10, 20, 30);
	}
}
