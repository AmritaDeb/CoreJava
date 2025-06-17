package oop.inheritance;

interface GrandFather {
	void sports();
}

interface GrandMother {
	void sing();
}

class ParentFather {
	void paint() {
		System.out.println("Painting..");
	}
}

class ChildSon extends ParentFather implements GrandFather, GrandMother {

	@Override
	public void sing() {
		System.out.println("Singing..");
	}

	@Override
	public void sports() {
		System.out.println("Playing Badminton..");
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) {
		ChildSon child = new ChildSon();
		child.sports();
		child.sing();
		child.paint();
	}

}
