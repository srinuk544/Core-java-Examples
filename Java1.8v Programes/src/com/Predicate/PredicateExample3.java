
// to check based on age;

package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample3 {

	String name;
	int age;

	public PredicateExample3(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public static void main(String[] args) {

		PredicateExample3 p1 = new PredicateExample3("srinu", 24);
		PredicateExample3 p2 = new PredicateExample3("vasu", 28);
		PredicateExample3 p3 = new PredicateExample3("venu", 14);
		PredicateExample3 p4 = new PredicateExample3("venkat", 35);
		PredicateExample3 p5 = new PredicateExample3("suresh", 45);
		PredicateExample3 p6 = new PredicateExample3("hemant", 44);

		List<PredicateExample3> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

		System.out.println(" =======by checking age based =====");

		Predicate<PredicateExample3> pp = n -> n.age >= 35;

		for (PredicateExample3 predicateExample3 : list) {

			if (pp.test(predicateExample3)) {
				System.out.println("Above 35 yeras persons:" + predicateExample3.name);
			} else {
				// System.out.println("Below 35 yeras persons:"+predicateExample3.name);
			}

		}

		System.out.println("=============by checking name based ============");

		Predicate<PredicateExample3> p = n -> n.name.startsWith("v");

		for (PredicateExample3 pe : list) {
			if (p.test(pe)) {
				System.out.println(pe.name);
			}
		}
	}

}
