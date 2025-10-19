package Com.cusers;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector al = new Vector<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		// al.add("srinivas");

		System.out.println(al);
		System.out.println(al.contains(4));
		System.out.println(al.hashCode());
		Enumeration e = al.elements();
		while (e.hasMoreElements()) {
			Integer object = (Integer) e.nextElement();
		//	System.out.println(object);
			if (object%2==0) {
				System.out.println(object);
				
			}

		}
	}

}
