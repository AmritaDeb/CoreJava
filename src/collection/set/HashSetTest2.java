package collection.set;

import java.util.HashSet;

/*
 * HashSet is a concrete class of Set interface
 * Rules : 
 * 1. Can not have duplicate object
 * 2. Doesn't remember the order of insertion of object
 * */

public class HashSetTest2 {
	
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		hSet.add("Dosa");
		hSet.add("Idli");
		System.out.println(hSet.size());
		System.out.println(hSet);
		
		HashSet hSet1 = new HashSet();
		hSet1.add("Rice");
		hSet1.add("Noodles");
		hSet1.addAll(hSet);
		System.out.println(hSet1);
		
		HashSet hSet2 = new HashSet(hSet);
		hSet2.add("Omlette");
		System.out.println(hSet2);
	}

}
