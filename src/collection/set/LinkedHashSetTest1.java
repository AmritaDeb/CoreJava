package collection.set;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet is a concrete class of Set interface
 * Rules : 
 * 1. Can not have duplicate object
 * 2. Does remember the order of insertion of object
 * 
 * Note : Use LinkedHashSet when you want a unique collection but don’t want to lose order.
 * */

public class LinkedHashSetTest1 {
	
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored

        System.out.println(set); // [Apple, Banana, Orange] (insertion order preserved)
	}

}
