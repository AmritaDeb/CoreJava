package collection.set;

import java.util.TreeSet;

/*
 * TreeSet is a concrete class of Set interface
 * Rules : 
 * 1. Can not have duplicate object
 * 2. Doesn't remember the order of insertion of object
 * 3. TreeSet sort the object in ascending order by default
 * */

public class TreeSetTest2 {
	
	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add("Dosa");
		tSet.add("Idli");
		System.out.println(tSet.size());
		System.out.println(tSet);
		
		TreeSet tSet1 = new TreeSet();
		tSet1.add("Rice");
		tSet1.add("Noodles");
		tSet1.addAll(tSet);
		System.out.println(tSet1);
		
		TreeSet tSet2 = new TreeSet(tSet);
		tSet2.add("Omlette");
		System.out.println(tSet2);
		
		if(tSet2.contains("Idli")) {
			tSet2.remove("Idli");
		}
		
		System.out.println(tSet2);
		
	}

}

