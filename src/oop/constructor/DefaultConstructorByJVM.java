package oop.constructor;

public class DefaultConstructorByJVM {
	
	int i;
	
	void test() {
		System.out.println("This is non static test() method");
	}

	public static void main(String[] args) {
		DefaultConstructorByJVM constructor = new DefaultConstructorByJVM();
		constructor.test();
		System.out.println("Non static variable value is : " + constructor.i);
	}

}
