package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateExample {
	String name;
	int age;
	double salary;

	BiPredicateExample(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " (Age: " + age + ", Salary: " + salary + ")";
	}

	public static void main(String[] args) {
		List<BiPredicateExample> employees = Arrays.asList(new BiPredicateExample("Alice", 30, 50000),
				new BiPredicateExample("Bob", 40, 70000), new BiPredicateExample("Charlie", 25, 45000),
				new BiPredicateExample("David", 35, 55000));

		BiPredicate<Integer, Double> isEligible = (age, salary) -> age > 30 && salary > 50000;
		employees.stream().filter(emp -> isEligible.test(emp.age, emp.salary)).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

	}
}