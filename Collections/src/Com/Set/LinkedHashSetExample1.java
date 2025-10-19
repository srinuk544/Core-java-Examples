package Com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet<>();
		
		hs.add("srinu");
		hs.add("venu");
		hs.add("java");
		hs.add("iphone");
		hs.add("krisha");
		hs.add("bala");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
	}

}
