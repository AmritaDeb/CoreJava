package collection.conversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ConvertListToArray {
	
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
		
		// Convert List to Array
		
		Object[] listArray = list.toArray();
		for(int i=0; i<listArray.length; i++) {
			System.out.println(listArray[i]);
		}
		
	}

}
