package collection.list;

public class Employee {
	
	int empId;
	String empName;
	String empLocation = "India";
	
	Employee(int empId, String empName, String empLocation){
		this.empId = empId;
		this.empName = empName;
		if(!empLocation.isEmpty()) {
			this.empLocation = empLocation;
		}
	}
	
	void employeeDetails() {
		System.out.println("Employee id : " + empId);
		System.out.println("Employee name : " + empName);
		System.out.println("Employee location : " + empLocation);
	}
	
	void work(String empLocation) {
		if(!empLocation.isEmpty()) {
			this.empLocation = empLocation;
		}
	}

}
