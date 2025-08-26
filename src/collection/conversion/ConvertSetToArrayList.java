package collection.conversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ConvertSetToArrayList {
	
	public static void main(String[] args) {
		
		// Convert HashSet to ArrayList
		
		HashSet hSet = new HashSet();
		hSet.add(10);
		hSet.add(30);
		hSet.add(20);
		hSet.add(70);
		System.out.println(hSet);
		Iterator iterator = hSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ArrayList list1 = new ArrayList(hSet);
		System.out.println(list1);
		
		// Convert TreeSet to ArrayList
		
		TreeSet tSet = new TreeSet();
		tSet.add(10);
		tSet.add(30);
		tSet.add(20);
		tSet.add(70);
		System.out.println(tSet);
		Iterator iterator2 = tSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		ArrayList list2 = new ArrayList(tSet);
		System.out.println(list2);
	}

}
