package com.Predicate;

import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateExample5 {
	public static void main(String[] args) {
		String[] s = { "srinu", "katta", "vasu", "srinivas", "vamsii" };

		Predicate<String> predicate = name -> name.startsWith("s") ;
		for (String string : s) {
			if (predicate.test(string)) {
				System.out.println(string);

			}

		}
	}

}
