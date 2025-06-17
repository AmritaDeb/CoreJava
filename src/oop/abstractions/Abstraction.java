package oop.abstractions;

/* Hiding the implementation details is known as abstraction
* A method without implementation is known as abstract method
* A method with implementation is known as concrete method
*
* A class prefix with abstract known as abstract class
* we can not create object of abstract class
* abstract class can have -
* 1. only abstract method
* 2. only concrete methods
* 3. both abstract and concrete methods
*
* An Abstract class is a partial abstraction
* An Interface is a full abstraction*/

abstract class AnimalType {
	abstract void makeNoise();
	public void breath() {
		System.out.println("Inhale O2 and exhale CO2");
	}
}

class DogType extends AnimalType {
	@Override
	void makeNoise() {
		System.out.println("Bow.. Bow..");
	}
}

class CatType extends AnimalType {
	@Override
	void makeNoise() {
		System.out.println("Mew.. Mew..");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		DogType dog = new DogType();
		dog.breath();
		dog.makeNoise();
		
		CatType cat = new CatType();
		cat.breath();
		cat.makeNoise();
		
		//Animal1 animal = new Animal1();   // Can't create object of an abstract class
		AnimalType animal = new CatType();
		animal.makeNoise();
	}

}
