package Com.map;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		// Create HashMap with Object type to allow heterogeneous keys and values
		HashMap<Object, Object> map = new HashMap<>();
		
		// 1. Duplicate Keys (❌ Not allowed → old value replaced)
		map.put(101, "Java");
		map.put(101, "Spring Boot"); // duplicate key, should replace "Java"

		// 2. Duplicate Values (✅ Allowed)
		map.put(102, "Microservices");
		map.put(103, "Microservices"); // same value allowed with different keys

		// 3. Heterogeneous Objects (✅ Allowed)
		map.put("KeyString", 500); // String as key, Integer as value
		map.put(10.5, true); // Double as key, Boolean as value

		// 4. Null Handling
		map.put(null, "First Null"); // null key allowed once
		map.put(null, "Replaced Null"); // overwrites previous null key value
		map.put(104, null); // null value allowed
		map.put(105, null); // multiple null values allowed

		// Print the map
		System.out.println("Final HashMap: " + map);

		// 5. Performance Test: put(), get(), remove()
		System.out.println("Get key 101: " + map.get(101));
		System.out.println("Remove key 102: " + map.remove(102));
		System.out.println("After Removal: " + map);

		// 6. Iterating through keys and values
		System.out.println("\nIterating Entries:");
		/*
		 * for (Map.Entry<Object, Object> entry : map.entrySet()) {
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue()); }
		 */

		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey() + "------------" + "Value:" + entry.getValue());

		}
	}
}