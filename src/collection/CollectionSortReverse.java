package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortReverse {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(25);
		list1.add(50);
		list1.add(35);
		list1.add(10);
		list1.add(45);
		list1.add(50);
		list1.add(55);
		System.out.println("list1 : " + list1);
		Collections.sort(list1);
		System.out.println("list1 : " + list1);
		Collections.reverse(list1);
		System.out.println("list1 : " + list1);
		Collections.reverse(list1);
		System.out.println("list1 : " + list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("list1 : " + list1);
		
		
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add("hello");
		list2.add(50);
		
		System.out.println("list2 : " + list2);
		Collections.sort(list2);
		System.out.println("list2 : " + list2);
	}

}
