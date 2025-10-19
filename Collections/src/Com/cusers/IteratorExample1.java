package Com.cusers;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			al.add(i);

		}
		System.out.println(al);
		System.out.println("-----------------------");
		System.out.println("After iteration");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer type = (Integer) itr.next();
			if (type % 2 == 0) {
				System.out.println(type);

			} else {
				itr.remove();
			}
			/* System.out.println(type); */
		}

	}

}
