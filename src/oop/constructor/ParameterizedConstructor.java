package oop.constructor;

public class ParameterizedConstructor {

	int i;

	void test() {
		System.out.println("This is non static test() method");
	}
	
	ParameterizedConstructor(){
		System.out.println("Zero Arg Constructor Called..");
	}
	
	ParameterizedConstructor(int id, String name){
		System.out.println("Parameterized Constructor Called..");
		i = id;
	}

	public static void main(String[] args) {
		ParameterizedConstructor constructor = new ParameterizedConstructor(5, "Amrita");
		constructor.test();
		System.out.println("Non static variable value is : " + constructor.i);
	}

}
