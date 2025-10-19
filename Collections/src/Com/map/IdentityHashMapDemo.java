package Com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, String> h=new HashMap<>();
		
		IdentityHashMap<String, String> i=new IdentityHashMap<>();
		
		String s1=new String("java");
		String s2=new String("java");
		
		
		h.put(s1,"framework");        //.equals method for content comparasion
		h.put(s2,"lng");
		
		i.put(s1, "framework");        // == method for reference comparation
		i.put(s2,"lng");
		
		System.out.println("Hashmap:"+h);
		System.out.println("identity hashmap:"+i);
	}

}
