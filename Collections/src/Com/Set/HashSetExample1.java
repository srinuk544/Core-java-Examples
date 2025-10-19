package Com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("srinu");
		hs.add("venu");
		hs.add("java");
		hs.add("iphone");
		hs.add("krisha");
		hs.add("bala");
		hs.add("srinu");

		System.out.println(hs);
		hs.add("krishna");
		System.out.println(hs.size());
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			s.startsWith("k");
			System.out.println(s);
		}
		
	}

}
