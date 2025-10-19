package com.LambdaExpressions;

import java.util.Enumeration;

public class Test {

	public static void main(String[] args) {

		Interf1 addition = (a, b) -> a + b;

		int result = addition.operation(20, 25);
		System.out.println(result);

		Interf1 multipication = (a, b) -> a * b;

		System.out.println(multipication.operation(10, 5));
	}

}
