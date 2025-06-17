package oop.inheritance;

/*
 * Where we can have different base class and derived class in every level
 * Where 1 derived class can inherit 1 base class,
 * then by making this derived class as base class in 2nd level, another derived class can inherit that 2nd level base class and so on
 * */

class Car {
	public void vehicleType() {
		System.out.println("Vehicle Type is : Car" );
	}
	
}

class Maruti extends Car {
	public void brandName() {
		System.out.println("Brand Name is : Maruti");
	}
}

class MarutiSwift extends Maruti {
	public void modelName() {
		System.out.println("Model Name is : Maruti Swift");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		MarutiSwift swift = new MarutiSwift();
		swift.vehicleType();
		swift.brandName();
		swift.modelName();
	}

}
