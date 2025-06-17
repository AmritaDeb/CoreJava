package oop.encapsulation;

/*
 * The Process of binding the attributes and behavior of an object together is known as encapsulation
 * Wrapping up of data as well as methods is known as encapsulation
 * Encapsulation is achieved with the help of class
 * */

public class Encapsulation {
	
	int id;
	String name;
	double salary;
	
	Encapsulation(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void showDetails() {
		System.out.println("Employee Id is : " + id);
		System.out.println("Employee Name is : " + name);
		System.out.println("Employee Salary is : " + salary);
	}
	
	void work() {
		System.out.println("Employee " + this.name + " should work on automation");
	}

	public static void main(String[] args) {
		Encapsulation empObj = new Encapsulation(5,"Amrita",60000);
		empObj.showDetails();
		empObj.work();
	}

}
