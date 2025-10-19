package com.Logic.sd2;

public class SwappingTwoStringEXample {

	public static void main(String[] args) {

		String a = "java";
		String b = "spring";
		System.out.println("Before swapping:" + a + "---" + b);
		/*
		 * String x = a; a = b; b = x; System.out.println("After swapping :" + a +
		 * "----" + b);
		 */

		a = a + b;

		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("Without using third Variable:" + a + "-----------" + b);

	}

}
