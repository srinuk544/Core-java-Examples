package Com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo1 {

	int roll;
	String name;
	String address;

	public ComparatorDemo1(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		ComparatorDemo1 c1 = new ComparatorDemo1(1, "vasu", "darsi");
		ComparatorDemo1 c2 = new ComparatorDemo1(4, "venkat", "markapur");
		ComparatorDemo1 c3 = new ComparatorDemo1(8, "murali", "vinukonda");
		ComparatorDemo1 c4 = new ComparatorDemo1(2, "rajesh", "ongole");

		List<ComparatorDemo1> ll = Arrays.asList(c1, c2, c3, c4);

		Comparator<ComparatorDemo1> com = (s1, s2) -> s1.name.compareTo(s2.name);

		Collections.sort(ll, com);
		for (ComparatorDemo1 comparatorDemo1 : ll) {
			System.out.println(comparatorDemo1.roll + "---" + comparatorDemo1.name + "----" + comparatorDemo1.address);
		}
	}

}
