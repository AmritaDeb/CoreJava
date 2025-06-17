package oop;

/* A java file can have multiple classes in it.
*
* If we compile a java file which has more than one class,
* java compiler generates a separate class file for each class.
*
* If a java file has a class with public access specifier,
* then it is mandatory for naming the java file with the same name given to the public class.
*
* So a java file can have more than 1 class but
* it can have only one class defined as public
*
* Only the public class can be called from other classes from other java files
*
* We should declare the main method inside that public class only
* */
public class MultipleClass {
	public static void main(String[] args) {
		System.out.println("Begining");
		SubClass1 subClass1 = new SubClass1();
		subClass1.execute(new SubClass2());
		System.out.println("Ending");
	}
}
class SubClass1{
	
	void execute(SubClass2 subClass2) {
		System.out.println("SubClass1 execution");
		subClass2.execute();
	}
	
}
class SubClass2{
	
	void execute() {
		System.out.println("SubClass2 execution");
	}
}
