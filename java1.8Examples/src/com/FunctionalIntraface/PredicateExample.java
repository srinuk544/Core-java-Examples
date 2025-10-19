package com.FunctionalIntraface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		String[] str = { "srinu", "vasu", "katta", "srii" };
		Predicate<String> pp = name -> name.startsWith("s");

		for (String name : str) {
			if (pp.test(name)) {
				System.out.println(name);

			}
		}

	}

}
