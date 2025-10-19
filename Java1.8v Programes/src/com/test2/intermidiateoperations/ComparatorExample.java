package com.test2.intermidiateoperations;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Charlie", 35), new Employee("Alice", 30),
				new Employee("Bob", 25));

		employees.stream().sorted(Comparator.comparingInt(i -> i.age)).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));
		
		
		
		
		/*
		 * employees.stream() .sorted(Comparator.comparingInt(i -> i.age).reversed())
		 * .collect(Collectors.toList()) .forEach(System.out::println);
		 */
	}
}
