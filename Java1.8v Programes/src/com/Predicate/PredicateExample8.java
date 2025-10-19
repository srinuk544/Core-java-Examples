package com.Predicate;

import java.util.function.Predicate;

public class PredicateExample8 {
	public static void main(String[] args) {
		Predicate<Integer> pp = i -> i > 20;
		System.out.println(pp.test(30));
	}

}
