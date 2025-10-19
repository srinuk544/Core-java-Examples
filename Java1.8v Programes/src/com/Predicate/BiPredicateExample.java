package com.Predicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import com.lambda.intraface;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf=(a,b)->a+b;
		System.out.println(bf.apply(10, 90));
		
		
		BiFunction<String, String, String> bb=(a,b)->a.concat(b);
		System.out.println(bb.apply("srinu", "katta"));

	}

}
