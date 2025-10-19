package Com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add(12);
		al.add(22);
		al.add(552);
		al.add(42);
		al.add(42);
		al.add(null);
		System.out.println(al);

		System.out.println(al.contains(1));
		System.out.println(al.get(3));
		System.out.println(al.remove(6));
		System.out.println(al.lastIndexOf(6));
		for (Object object : al) {
			System.out.println(object);

		}

		
		System.out.println("==========================");

		
		Collections.sort(al,new mycustom() );
		
		System.out.println("After sorting:"+al);
	}

}

class mycustom implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		/*
		 * if (o1 > o2) { return +1;
		 * 
		 * } else if (o1 < o2) { return -1;
		 * 
		 * } else { return 0; }
		 */
		
		
		//return o1.compareTo(o2);   accending orderr
		
		return o2.compareTo(o1);      //deccending order
	}

}
