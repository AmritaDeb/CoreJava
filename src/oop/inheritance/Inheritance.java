package oop.inheritance;

/* The process of acquiring the attribute and behavior from superclass to subclass is known inheritance.
* We can achieve inheritance using 'extends' keyword
*
* The class from where all the properties are acquired is known as superclass
* The class which is acquiring the property of super class is known as subclass
*
* subclass can have all the properties of superclass
* superclass can not have properties of subclass
*
* By creating subclass object, we can access static and non-static members of superclass and subclass both
* By creating superclass object, we can access static and non-static members of superclass only
*
* final class can not be inherited
* final data members can be inherited but can not be reinitialized
* final methods can not be overridden
* */


class A {
	int i;
	static int j;
	static int m;
	void test() {
		System.out.println("Thsi is A.test()");
	}
	A(){
		System.out.println("This is constructor block A()");
	}
	static {
		System.out.println("This is A-SIB");
	}
	{
		System.out.println("This is A-IIB");
	}
}

class B extends A {
	int i;
	static int j;
	void test() {
		System.out.println("This is B.test()");
	}
	B(){
		System.out.println("This is constructor block B()");
	}
	static {
		System.out.println("This is B-SIB");
	}
	{
		System.out.println("This is B-IIB");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		System.out.println(A.j);
		A a = new A();
		System.out.println(a.i);
		a.test();
		System.out.println("----------------------------");
		
		System.out.println(B.j);
		System.out.println(B.m);
		B b = new B();
		System.out.println(b.i);
		b.test();
	}

}
