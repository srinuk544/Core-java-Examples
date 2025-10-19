package com.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinExample7 {
	String name;
	String location;
	String dept;

	public PredicateJoinExample7(String name, String location, String dept) {

		this.name = name;
		this.location = location;
		this.dept = dept;

	}

	public static void main(String[] args) {

		PredicateJoinExample7 e1 = new PredicateJoinExample7("srinu", "hyd", "java");
		PredicateJoinExample7 e2 = new PredicateJoinExample7("vasu", "pune", "testing");
		PredicateJoinExample7 e3 = new PredicateJoinExample7("battu", "hyd", "java");
		PredicateJoinExample7 e4 = new PredicateJoinExample7("balakrishna", "chennai", "oracle");

		List<PredicateJoinExample7> employe = Arrays.asList(e1, e2, e3, e4);
		Predicate<PredicateJoinExample7> p1 = e -> e.location.equals("hyd");
		Predicate<PredicateJoinExample7> p2 = e -> e.dept.endsWith("java");

		Predicate<PredicateJoinExample7> pp = p1.and(p2);

		for (PredicateJoinExample7 predicateJoinExample7 : employe) {
			if (pp.test(predicateJoinExample7)) {
				System.out.println(predicateJoinExample7.name);
			}

		}

	}

}
