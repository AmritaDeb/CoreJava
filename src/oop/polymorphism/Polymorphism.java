package oop.polymorphism;

/* An object behaving in different forms in different places is known as polymorphism */

class AnimalClass {
	int leg = 4;
	
	void speak() {
		System.out.println("Speaking");
	}
}

class DogClass extends AnimalClass {
	int tail = 1;
	
	void speak() {
		System.out.println("Barking");
	}
	
	void speak(int count) {
		System.out.println("Barking Count : " + count);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		AnimalClass animal = new AnimalClass();
		animal.speak();
		System.out.println("Leg count is : " + animal.leg);
		System.out.println("--------------------------------");
		
		DogClass dog = new DogClass();
		dog.speak();
		dog.speak(10);										// Method Overloading
		System.out.println("Leg count is : " + dog.leg);
		System.out.println("Tail count is : "+ dog.tail);
		System.out.println("--------------------------------");
		
		AnimalClass dogAnimal = new DogClass();				// UpCasting
		dogAnimal.speak();									// Method Overriding
	}

}
