package Com.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet<>();
		s.add(10);
		s.add(10);
		s.add(100);
		s.add(1000);
		s.add(10000);
		s.add(100000);
		s.add(1000000);
		s.add(10000000);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		
	
	System.out.println(s.headSet(1000000));
	System.out.println(s.tailSet(1000));
	System.out.println(s.subSet(10, 10000));
	System.out.println(s.comparator());
	}

}
