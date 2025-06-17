package oop.constructor;

public class ConstructorsWithThisKeyword {
	
	int id;
	String name;
	double salary;
	
	ConstructorsWithThisKeyword(){
		System.out.println("Zero Arg Constructor Called..");
		System.out.println("----------------------------------------");
	}
	
	ConstructorsWithThisKeyword(int id){
		this.id = id;
		System.out.println("Constructor with 1 parameter Called..");
		System.out.println("Id is : " + id);
		System.out.println("----------------------------------------");
	}
	
	ConstructorsWithThisKeyword(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Constructor with 2 parameters Called..");
		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("----------------------------------------");
	}
	
	ConstructorsWithThisKeyword(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Constructor with 3 parameters Called..");
		System.out.println("Id is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("Salary is : " + salary);
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
		ConstructorsWithThisKeyword constructor1 = new ConstructorsWithThisKeyword();
		ConstructorsWithThisKeyword constructor2 = new ConstructorsWithThisKeyword(10);
		ConstructorsWithThisKeyword constructor3 = new ConstructorsWithThisKeyword(20,"Amrita");
		ConstructorsWithThisKeyword constructor4 = new ConstructorsWithThisKeyword(30,"Soumen",50000);
	}

}
