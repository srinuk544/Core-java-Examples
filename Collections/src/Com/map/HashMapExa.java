package Com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExa {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "srinu");
		hm.put(2, "vasu");
		hm.put(3, "venkat");
		System.out.println("====:" + hm);
		Set s=hm.keySet();
		System.out.println(s);
Collection c=hm.values();
System.out.println(c);
	}

}
