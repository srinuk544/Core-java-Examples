package Com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("srinu");
		al.add("apple");
		al.add("katta");
		al.add("okkkk");
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);

		}
		System.out.println(al.get(0));

		System.out.println(al.lastIndexOf(3));
		System.out.println(al.size());
		// System.out.println(al.clear());

		// al.clear();

		Collections.sort(al);
		System.out.println("After sorting :" + al);
	}

}
