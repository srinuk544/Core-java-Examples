package com.Predicate;

import java.util.function.Predicate;

public class Example1 {
	public static void main(String[] args) {

		String s[] = { "srinu", "vasu", "vamsi", "aruna", "anka" };

		Predicate<String> predicate = str -> str.startsWith("a");

		for (String string : s) {

			if (predicate.test(string)) {
				System.out.println(string + " strats with A");

			}

		}
	}

}
