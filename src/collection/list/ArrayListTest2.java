package collection.list;

import java.util.ArrayList;

public class ArrayListTest2 {
	
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
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(125);
		list3.add(50);
		list3.add(35);
		list3.add(10);
		list3.add(25);
		list3.add(100);
		list3.add(135);
		list3.add(10);
		list3.add(145);
		list3.add(50);
		list3.add(55);
		
		// Method retainAll()
		
		System.out.println(list3);
		list3.retainAll(list1);
		System.out.println(list3);
		
		for(int i=0; i<list1.size(); i++) {
			Integer obj = list1.get(i);
			System.out.println(obj.getClass().getSimpleName());
			int a = list1.get(i);
		}
		
		// Method remove()
		
		list1.remove(3);
		System.out.println(list1);
		
		// Method subList(fromIndex, toIndex) [act like removeRange()]
		
		list1.subList(1, 3);
		System.out.println(list1.subList(1, 3));
		
		// Method clear()
		
		list1.subList(1, 3).clear();
		System.out.println(list1);
		
		// Method removeALL()
		System.out.println(list2);
		list2.removeAll(list1);
		System.out.println(list2);
		
		// Method isEmpty()
		
		System.out.println(list1.isEmpty());
		
		// Method indexOf()
		
		System.out.println(list1);
		System.out.println(list1.indexOf(10));
		System.out.println(list1.indexOf(35));
		
		// Method contains()
		
		System.out.println(list1.contains(10));
		System.out.println(list1.contains(35));
		
	}

}
