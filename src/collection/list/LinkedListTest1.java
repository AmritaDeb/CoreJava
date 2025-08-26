package collection.list;

import java.util.LinkedList;

/*
 * LinkedList is a concrete class of List type collection where we can store multiple objects.
 * Rules :
 * 1. LinkedList allows duplicate values.
 * 2. It allows null values (multiple null values).
 * 3. It has index (starting from 0 and ends at length of LinkedList -1)
 * 4. LinkedList remember the order of insertion
 * */

public class LinkedListTest1 {

	public static void main(String[] args) {
		LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task1");
        tasks.add("Task2");
        tasks.addFirst("Urgent Task"); // add at beginning
        tasks.addLast("Final Task");   // add at end

        System.out.println(tasks); // [Urgent Task, Task1, Task2, Final Task]

        tasks.removeFirst(); // remove from beginning
        System.out.println(tasks);
		
	}

}
