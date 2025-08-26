package collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EntrySetCityExample {
	
	public static void main(String[] args) {
		Map<Integer, String> city = new HashMap<>();
		city.put(560004, "Kolkata");
		city.put(650001, "Mumbai");
		city.put(560003, "Asansol");
		city.put(560002, "Bangalore");
		city.put(650003, "Mumbai");
		System.out.println(city);
		
		// only pincode
		Set pincode = city.keySet();
		System.out.println(pincode);
		
		// only cityname
		Collection<String> names = city.values();
		System.out.println(names);
		
		ArrayList citynameList = new ArrayList(names);
		System.out.println(citynameList);
		
		// remove duplicate in city name value
		HashSet citynameSet = new HashSet(names);
		System.out.println(citynameSet);
		
		// unique value store in map
		
		Map<Integer, String> uniqueCityMap = new HashMap<>();
		Set uniqueValues = new HashSet();
		
		for(Map.Entry<Integer, String> entry : city.entrySet()) {
			if(uniqueValues.add(entry.getValue())) {
				// add returns false if value already exists
                uniqueCityMap.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println("After removing duplicate values: " + uniqueCityMap);
	}

}
