package Com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {

	String name;
	double salary;

	public ComparableDemo(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "ComparableDemo [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(ComparableDemo o) {
		// TODO Auto-generated method stub
		return Double.compare(this.salary, o.salary);
	}

	public static void main(String[] args) {
		ComparableDemo e1 = new ComparableDemo("Srinu", 25000);
		ComparableDemo e2 = new ComparableDemo("Venu", 32000);
		ComparableDemo e3 = new ComparableDemo("Gopi", 28000);

		List<ComparableDemo> ll = Arrays.asList(e1, e2, e3);
		System.out.println("-------------before sort-------");
		ll.forEach(System.out::println);
		System.out.println("-------------after sort-------");
		Collections.sort(ll);
		ll.forEach(System.out::println);

		System.out.println("----------java8---------------");

		ll.stream().sorted(Comparator.comparing(i -> i.toString())).forEach(System.out::println);
	}

}
