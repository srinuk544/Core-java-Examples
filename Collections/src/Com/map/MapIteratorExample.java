package Com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorExample {
	public static void main(String[] args) {
		// Creating a HashMap
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		// Iterating using entrySet() and Iterator
		Iterator<Map.Entry<Integer, String>> m = map.entrySet().iterator();
		while (m.hasNext()) {
			Map.Entry<Integer, String> entry = m.next();
			System.out.println(entry.getKey() + "---" + entry.getValue());

		}
		
		
		Set<Integer> mm=map.keySet();
		System.out.println(mm.contains(mm));
		
	}
}
