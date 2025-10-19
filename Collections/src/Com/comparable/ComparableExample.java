package Com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample> {
	int roll;
	String name;
	String address;

	public ComparableExample(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	/*
	 * @Override public int compareTo(ComparableExample o) { // TODO Auto-generated
	 * method stub return o.name.compareTo(this.name); }
	 */
	@Override
	public int compareTo(ComparableExample o) {
		// TODO Auto-generated method stub
		return this.roll-o.roll;
	}

	public static void main(String[] args) {
		ComparableExample c1 = new ComparableExample(1, "vasu", "darsi");
		ComparableExample c2 = new ComparableExample(4, "venkat", "markapur");
		ComparableExample c3 = new ComparableExample(8, "murali", "vinukonda");
		ComparableExample c4 = new ComparableExample(2, "rajesh", "ongole");

		List<ComparableExample> ll = Arrays.asList(c1, c2, c3, c4);

		Collections.sort(ll);
		for (ComparableExample comparableExample : ll) {
			System.out.println(comparableExample.roll + "-----" + comparableExample.name);

		}

	}

}
