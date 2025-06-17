package oop.constructor;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("Zero Arg Constructor Called..");
	}
	
	ConstructorOverloading(int id){
		System.out.println("Constructor with 1 parameter Called..");
	}
	
	ConstructorOverloading(int id, String name){
		System.out.println("Constructor with 2 parameters Called..");
	}
	
	ConstructorOverloading(int id, String name, double salary){
		System.out.println("Constructor with 3 parameters Called..");
	}

	public static void main(String[] args) {
		ConstructorOverloading constructor1 = new ConstructorOverloading();
		ConstructorOverloading constructor2 = new ConstructorOverloading(10);
		ConstructorOverloading constructor3 = new ConstructorOverloading(10,"Amrita");
		ConstructorOverloading constructor4 = new ConstructorOverloading(10,"Amrita",50000);
	}

}
