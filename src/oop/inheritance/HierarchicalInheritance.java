package oop.inheritance;

/*
* Where 1 super class is inherited by many sub classes
* */

class Mom {
	public void sing() {
		System.out.println("Singing..");
	}
	
	public void sports() {
		System.out.println("Playing badminton..");
	}
}

class Son extends Mom {
	
}

class Daughter extends Mom {
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Son son = new Son();
		son.sports();
		
		Daughter daughter = new Daughter();
		daughter.sing();
	}

}
