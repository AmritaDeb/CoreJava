package oop.inheritance;

/*
* Where we will get only 1 base class and 1 derived class
* Where only 1 class can inherit the base class
* */

class Animal {
	static int eyes = 2;
	int legs = 4;
	
	static void walk() {
		System.out.println("It can walk");
	}
	
	void run() {
		System.out.println("It can run");
	}
}

class Dog extends Animal {
	static String breed = "Labrador";
	String color = "White";
	
	static void bark() {
		System.out.println("It can bark");
	}
	
	void wag() {
		System.out.println("It can wagging");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
	Dog.walk();
	Dog.bark();
	System.out.println("How many eyes : " + Dog.eyes);
	System.out.println("Breed is : " + Dog.breed);
	Dog dog = new Dog();
	dog.walk();
	dog.run();
	dog.bark();
	dog.wag();
	System.out.println("How many legs : " + dog.legs);
	System.out.println("Breed Color is : " + dog.color);
	}

}
