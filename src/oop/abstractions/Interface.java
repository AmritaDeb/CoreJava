package oop.abstractions;

/* Interface is a type of class where the methods are by default abstract and
* data members are by default static and final
*
* we can achieve interface by using 'implements' keyword
*
* An Interface is a full abstraction
*
* We can not create object of an interface
* We can create reference variable of an interface
*
* if a class implements interface, then the class should override all the abstract methods of the interface
* */

interface Dogs {
	int leg = 4;		// By default static and final
	void makeNoise();
}

class Puppy implements Dogs {

	@Override
	public void makeNoise() {
		System.out.println("Barking");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.makeNoise();
//		Puppy.leg = 10;			// The final variable can not be reassigned

		Dogs dog = new Puppy();
		dog.makeNoise();
		
		/*Can not initiate the type of Interface, we can't create object of an interface */
//		Dogs d = new Dogs();

	}

}
