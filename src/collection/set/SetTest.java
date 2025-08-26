package collection.set;

import java.util.HashSet;

public class SetTest {
	
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		System.out.println(set1);
		
		HashSet set2 = new HashSet();
		set2.add(20);
		set2.add(30);
		set2.add(40);
		System.out.println(set2);
		
		// Difference
		set1.removeAll(set2);
		System.out.println(set1);		// [10] 
		
		// Union
		set1.addAll(set2);
		System.out.println(set1);		// [10,20,30,40]
		
		
		// Intersection
		set1.retainAll(set2);
		System.out.println(set1);	// [20,30]
	}

}
