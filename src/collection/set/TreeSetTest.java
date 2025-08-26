package collection.set;

import java.util.TreeSet;

/*
 * TreeSet is a concrete class of Set interface
 * Rules : 
 * 1. Can not have duplicate object
 * 2. Doesn't remember the order of insertion of object
 * 3. TreeSet sort the object in ascending order by default
 * */

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add(70);
		tSet.add(30);
		tSet.add(50);
		System.out.println(tSet);
		System.out.println(tSet.descendingSet());
		
	}

}

