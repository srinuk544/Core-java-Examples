package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample11 {
	private String name;
	private String location;
	private String Dept;

	public PredicateExample11(String name, String location, String Dept) {
		this.name = name;
		this.location = location;
		this.Dept = Dept;

	}

	public static void main(String[] args) {
		PredicateExample11 p1 = new PredicateExample11("srinu", "hyderabad", "Backend");
		PredicateExample11 p2 = new PredicateExample11("venu", "hyderabad", "test");
		PredicateExample11 p3 = new PredicateExample11("venkat", "hyderabad", "Backend");
		PredicateExample11 p4 = new PredicateExample11("hari", "chennai", "frontend");
		PredicateExample11 p5 = new PredicateExample11("bramaji", "chennai", "Flutter");

		List<PredicateExample11> ll = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<PredicateExample11> p = num -> num.location.equals("hyderabad");
		Predicate<PredicateExample11> pp = num -> num.Dept.equals("Backend");
		Predicate<PredicateExample11> ppp = p.and(pp);                          // And method
		Predicate<PredicateExample11> pppp = p.or(pp);                         // or method
		

		for (PredicateExample11 predicateExample11 : ll) {

			if (pppp.test(predicateExample11)) {
				System.out.println(predicateExample11.name);

			}

		}

	}

}
