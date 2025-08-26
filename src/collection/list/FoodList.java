package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoodList {

	public static void main(String[] args) {
        // Declare List (interface) but initialize with ArrayList (implementation)
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // duplicates allowed

        // Display list
        System.out.println("Fruits List: " + fruits);

        // Access by index
        System.out.println("First fruit: " + fruits.get(0));

        // Update element
        fruits.set(1, "Orange"); 
        System.out.println("Updated List: " + fruits);

        // Remove element
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // Iterate
        System.out.println("\nIterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Another implementation (LinkedList) – no code change except constructor
        List<String> veg = new LinkedList<>();
        veg.add("Potato");
        veg.add("Tomato");
        System.out.println("\nVegetables: " + veg);
    }
}
