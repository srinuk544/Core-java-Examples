package Com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 35);
		System.out.println(map);
		System.out.println("===============");
		Set s1 = map.keySet();
		System.out.println("Keys :" + s1);
		System.out.println("===============");
		Set s2 = map.entrySet();
		System.out.println("entry pppppppset:" + s2);
		System.out.println("===============");
		Collection c = map.values();
		System.out.println(c);

		System.out.println("===============");
		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();

			System.out.println(object);
		}
		System.out.println("===============");
		

		

		for (String entery : map.keySet()) {
			System.out.println(entery);

		}
		System.out.println("===============");
		for (Integer pk : map.values()) {
			System.out.println(pk);
		}

		
		
		System.out.println(map.containsKey("Bob"));
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());
		
	}
}
