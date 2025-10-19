package Com.Set;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		
		ts.add(11);
		ts.add(11);
		ts.add(12);
		ts.add(13);
		ts.add(14);
		
		System.out.println(ts);
		
		System.out.println(ts);
		ts.add("srinu");
		System.out.println(ts);
	}

}
