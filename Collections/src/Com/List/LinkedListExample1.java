package Com.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add("usa");
		ll.add("india");
		ll.add("uk");
		ll.add("canada");
		ll.add("aus");

		System.out.println(ll);
		System.out.println(ll.contains("uk"));
		ll.addFirst("andhra");
		ll.addLast("pak");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.contains("uk"));
		System.out.println(ll.isEmpty());
		System.out.println(ll.hashCode());

		System.out.println("--------------------");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);

		}
		System.out.println(ll.removeAll(ll));
		System.out.println(ll);
	}

}
