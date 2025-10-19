package Com.cusers;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList<>();
		ll.add("srinu");
		ll.add("venu");
		ll.add("hari");
		ll.add("vasu");
		ll.add("venkat");
		ll.add("battu");
		ll.add("vamsi");
		
		
		System.out.println("-----------------");
		System.out.println(ll);
		System.out.println("-----------------");
		System.out.println(ll.size());
		
		
		Iterator itr=ll.iterator();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			System.out.println(type);
		}
		

	}

}
