package oop.inheritance;

/*
* Where 1 sub class is implemented by multiple base class(interface)
* */

interface Father {
	void sports();
}

interface Mother {
	void sing();
}

class Child implements Father, Mother {

	@Override
	public void sing() {
		System.out.println("Singing..");
	}

	@Override
	public void sports() {
		System.out.println("Playing Badminton..");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.sing();
		child.sports();

	}

}
