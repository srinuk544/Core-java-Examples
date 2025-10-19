package com.Predicate;

import java.util.function.Predicate;

import com.lambda.intraf;

public class PredicateExample1 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println("even number print:" + p.test(10));
	}

}
