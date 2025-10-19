package com.test2.intermidiateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	String name;
	int id;
	double salary;

	public FilterExample(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "FilterExample [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		FilterExample f1 = new FilterExample("srinu", 1, 25000);
		FilterExample f2 = new FilterExample("venakt", 2, 35000);
		FilterExample f3 = new FilterExample("srinu", 10, 55000);
		FilterExample f4 = new FilterExample("srinu", 15, 5000);
		FilterExample f5 = new FilterExample("srinu", 5, 85000);

		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());
		System.out.println("================after filter===========");
		List<FilterExample> ll = Arrays.asList(f1, f2, f3, f4, f5);
		ll.stream().filter(i -> i.salary >= 45000).collect(Collectors.toList()).forEach(i -> System.out.println(i));

	}
}
