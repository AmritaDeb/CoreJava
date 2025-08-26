package collection.conversion;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertSetToArray {
	
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		hSet.add(10);
		hSet.add(30);
		hSet.add(20);
		hSet.add(70);
		System.out.println(hSet);
		
		// Convert hSet to Array
		
		Object[] hSetArray = hSet.toArray();
		for(int i=0; i<hSetArray.length; i++) {
			System.out.println(hSetArray[i]);
		}
		
		TreeSet tSet = new TreeSet();
		tSet.add(10);
		tSet.add(30);
		tSet.add(20);
		tSet.add(70);
		System.out.println(tSet);
		
		// Convert tSet to Array
		
		Object[] tSetArray = tSet.toArray();
		for(int i=0; i<tSetArray.length; i++) {
			System.out.println(tSetArray[i]);
		}
	}

}
