package Com.comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo  {

	

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		// Adding string names to the list
		names.add("Srinu");
		names.add("Venu");
		names.add("Ravi");
		names.add("Anil");
		names.add("Kiran");

		System.out.println("List of Names: " + names);
		Collections.sort(names);
		System.out.println("affetr asending:" + names);
		Collections.sort(names, Comparator.reverseOrder());
		System.out.println("decending order:" + names);
	}
}
