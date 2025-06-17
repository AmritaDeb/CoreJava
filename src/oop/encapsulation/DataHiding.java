package oop.encapsulation;

/*
 * Data hiding is achieved through encapsulation
* -> the data members of the class to be made as private
* -> defining getter() and setter() methods
* # getter() is used to read the private member variable of a class
* # setter() is used write/modify the private member variable of a class
*
* If a data member is private it means it can only be accessed within the same class.
* No outside class can access private data member (variable) of other class.
*
* However if we setup public getter and setter methods to read and update the private data fields
* then the outside class can access those private data fields via public methods.
*
* getter() and setter() methods should not have any private access specifier, recommend is public,
*
* If only getter() is used then private variable should be only readable outside the class
* If only setter() is used then private variable should be only writable outside the class
* If both are used then private variable should be readable and writable outside the class
* */


class Login {
	
	// Declaration
	private String username;
	private String password;
	
	// Initialization
	public Login(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	// Utilization
	public void showDetails() {
		System.out.println("Username is : " + username);
		System.out.println("Password is : " + password);
	}
}

public class DataHiding {

	public static void main(String[] args) {
		Login login = new Login("amrita@yopmail.com","Password@123");
		login.showDetails();
		
	}

}
