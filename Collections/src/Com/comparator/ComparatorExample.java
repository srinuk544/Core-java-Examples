package Com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(2);

		System.out.println("Original List: " + numbers);

		Collections.sort(numbers, new mycomparator());
		System.out.println("after sorting will decending order:" + numbers);
	}
}

class mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);

	}

}