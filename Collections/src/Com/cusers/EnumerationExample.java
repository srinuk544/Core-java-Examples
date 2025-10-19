package Com.cusers;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		Vector<Integer> al = new Vector();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);

		System.out.println(al);

		System.out.println(al.size());
		Enumeration e=al.elements();
		while (e.hasMoreElements()) {
			Integer object = (Integer) e.nextElement();
			System.out.println(object);
		}
		
	}

}
