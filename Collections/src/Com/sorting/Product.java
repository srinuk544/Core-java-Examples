package Com.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	String name;
	int id;

	public Product(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "[Name=" + name + ", ID=" + id + "]";
	}

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product("Charlie", 3), new Product("Alice", 2), new Product("Alice", 1));

		// Sorting by Name, then by ID
		// list.sort(Comparator.comparing(Product::getName).thenComparing(Product::getId));
		list.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getId))
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Sorted by Name, then by ID: " + list);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}
