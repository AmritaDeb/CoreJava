package collection.conversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ConvertArrayListToSet {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(70);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Convert ArrayList to HashSet
		
		HashSet hSet = new HashSet(list);
		System.out.println(hSet);
		
		// Convert ArrayList to TreeSet
		
		TreeSet tSet = new TreeSet(list);
		System.out.println(tSet);
	}

}
