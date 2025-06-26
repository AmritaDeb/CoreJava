package oop.constructor;

class Employee {
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}	
}

class Developer extends Employee {
	
	String skill;

	Developer(int empId, String empName,String skill){
		super(empId, empName);
		this.skill = skill;
	}
	
	void showEmpDetails() {
		System.out.println("Employee id is : " + empId);
		System.out.println("Employee name is : " + empName);
		System.out.println("Employee skill is : "+ skill);
	}
	
}

public class ConstructorChaining2 {

	public static void main(String[] args) {
		Developer devEmp = new Developer(101, "Amrita", "Java");
		devEmp.showEmpDetails();
		
	}

}
