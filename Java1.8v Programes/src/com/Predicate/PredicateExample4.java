package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample4 {

	private String name;
	private int age;
	private double salary;

	public PredicateExample4(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void main(String[] args) {
		PredicateExample4 p1 = new PredicateExample4("Srinu", 25, 45000);
		PredicateExample4 p2 = new PredicateExample4("venkat", 24, 35000);
		PredicateExample4 p3 = new PredicateExample4("hari", 30, 5000);
		PredicateExample4 p4 = new PredicateExample4("vasu", 28, 28000);

		List<PredicateExample4> person = Arrays.asList(p1, p2, p3, p4);

		Predicate<PredicateExample4> predicate = p -> p.age >= 30 ;

		for (PredicateExample4 predicateExample4 : person) {
			if (predicate.test(predicateExample4)) {
				System.out.println(predicateExample4.name+"----"+predicateExample4.salary);

			}

		}

	}

}
