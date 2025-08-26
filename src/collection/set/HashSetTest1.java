package collection.set;

import java.util.HashSet;

/*
 * HashSet is a concrete class of Set interface
 * Rules : 
 * 1. Can not have duplicate object
 * 2. Doesn't remember the order of insertion of object
 * */

public class HashSetTest1 {
	
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		hSet.add(10);
		hSet.add(30);
		hSet.add(50);
		System.out.println(hSet);
		
		System.out.println(hSet.remove(20));
		System.out.println(hSet.remove(30));
		
		System.out.println(hSet);
	}

}
