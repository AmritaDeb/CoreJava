package collection.list;

import java.util.ArrayList;

/*
 * ArrayList is a concrete class of List type collection where we can store multiple objects.
 * Rules :
 * 1. ArrayList allows duplicate values.
 * 2. It allows null values (multiple null values).
 * 3. It has index (starting from 0 and ends at length of arraylist -1)
 * 4. ArrayList remember the order of insertion
 * */

public class ArrayListTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Method add()

		System.out.println("--------------Method add()------------");
		ArrayList list = new ArrayList();
		list.add(10);
		list.add('a');
		list.add("Amrita");
		System.out.println("List : " + list);

		ArrayList list1 = new ArrayList<>();
		list1.add('b');
		list1.add(list);
		System.out.println(list1);

		ArrayList list2 = new ArrayList(list);
		list2.add('c');
		System.out.println("List2 : " + list2);

		// Method addALL()

		System.out.println("--------------Method addAll()------------");
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		list3.add(35);
		list3.add("Soumen");
		System.out.println("List3 : " + list3);

		// Method get()

		System.out.println("--------------Method get()------------");
		System.out.println(list3.get(1));
		System.out.println((Integer) list3.get(0));

		// Method size()

		System.out.println("--------------Method size()------------");
		System.out.println("Size of list : " + list3.size());
		for (int i = 0; i < list3.size(); i++) {
			
			if (list3.get(i) instanceof Integer) {
				int a = (Integer) list3.get(i);
				System.out.println("Integer value : " + a);
			} else if (list3.get(i) instanceof Character) {
				char c = (Character) list3.get(i);
				System.out.println("Character value : " + c);
			} else if (list3.get(i) instanceof String) {
				String s = (String) list3.get(i);
				System.out.println("String value : " + s);
			}

			Object obj = list3.get(i);
			System.out.println(obj.getClass());		// class java.lang.String
			System.out.println(obj.getClass().getSimpleName());		// String
			switch (obj.getClass().getSimpleName()) {
				case "Integer":
					int a = (Integer) list3.get(i);
					System.out.println("Integer value : " + a);
					break;
				case "Character":
					char c = (Character) list3.get(i);
					System.out.println("Character value : " + c);
					break;
				case "String":
					String s = (String) list3.get(i);
					System.out.println("String value : " + s);
					break;
				default:
					System.out.println("Unknown type : " + obj);
					break;

			}
		}

	}

}
