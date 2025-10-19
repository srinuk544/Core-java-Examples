package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
	String name;
	int age;

	public ConsumerDemo1(int age, String name) {
		this.age = age;
		this.name = name;

	}

	public static void main(String[] args) {
		ConsumerDemo1 c1 = new ConsumerDemo1(10, "vasuu");
		ConsumerDemo1 c2 = new ConsumerDemo1(25, "vamsi");
		ConsumerDemo1 c3 = new ConsumerDemo1(13, "hari");
		ConsumerDemo1 c4 = new ConsumerDemo1(100, "krishna");
		ConsumerDemo1 c5 = new ConsumerDemo1(11, "rama");
		List<ConsumerDemo1> list = Arrays.asList(c1, c2, c3, c4, c5);

		/*
		 * Consumer<ConsumerDemo1> con = c -> System.out.println(c.name.toUpperCase());
		 * list.forEach(con);
		 */

		Consumer<ConsumerDemo1> con = c -> {
			c.age = c.age * 2;
			System.out.println(c.name + " new salary: " + c.age);
		};
		list.forEach(con);
	}
}
