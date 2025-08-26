package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTest1 {
	
	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add(70);
		tSet.add(30);
		tSet.add(50);
		tSet.add(10);
		tSet.add(10);
		System.out.println(tSet);
		
		Iterator iterator = tSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator descIterator = tSet.descendingIterator();
		while(descIterator.hasNext()) {
			System.out.println(descIterator.next());
		}
	}

}
