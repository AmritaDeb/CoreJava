package collection.list;

import java.util.ArrayList;

public class EmpDriver {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Amrita","");
		Employee emp2 = new Employee(102,"Soumen","");
		emp1.work("Kolkata");
		
		emp1.employeeDetails();
		emp2.employeeDetails();
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(new Employee(103,"Diya","Delhi"));
		
		System.out.println(list);			// Employees reference addresses
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("Employee id : " + list.get(i).empId); 
			System.out.println("Employee name : " + list.get(i).empName); 
			System.out.println("Employee location : " + list.get(i).empLocation); 
		}
		
	}

}
