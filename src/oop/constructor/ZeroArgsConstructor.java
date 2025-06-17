package oop.constructor;

public class ZeroArgsConstructor {

	int i;

	void test() {
		System.out.println("This is non static test() method");
	}
	
	ZeroArgsConstructor(){
		System.out.println("Zero Arg Constructor Called..");
	}

	public static void main(String[] args) {
		ZeroArgsConstructor constructor = new ZeroArgsConstructor();
		constructor.test();
		System.out.println("Non static variable value is : " + constructor.i);
	}

}
