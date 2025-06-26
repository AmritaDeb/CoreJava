package oop.polymorphism;

class SalaryCalculator {

	// 1. Calculate salary for full-time employee with base and bonus
	public double calculateSalary(double baseSalary, double bonusAmount) {
		return baseSalary + bonusAmount;
	}

	// 2. Calculate salary for part-time employee based on hours worked
	public double calculateSalary(int hoursWorked, double hourlyRate) {
		return hoursWorked * hourlyRate;
	}
	
	// 3. Calculate salary for contractor with flat fee
	public double calculateSalary(double contractAmount) {
		return contractAmount;
	}
	
	// 4. Calculate salary with overtime
	public double calculateSalary(double baseSalary, int otWorked, double otRate) {
		return baseSalary + (otWorked * otRate);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		SalaryCalculator calc = new SalaryCalculator();
		
		System.out.println("Full time employee salary : $" + calc.calculateSalary(50000.0,50.0));
		System.out.println("Part time employee salary : $" + calc.calculateSalary(5,500.0));
		System.out.println("Contractor employee salary : $" + calc.calculateSalary(10000.0));
		System.out.println("Full time employee salary with overtime : $" + calc.calculateSalary(50000.0, 4, 50.0));

	}

}
