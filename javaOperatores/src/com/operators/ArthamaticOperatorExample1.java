package com.operators;

public class ArthamaticOperatorExample1 {
	public static void main(String[] args) {
		int x = 10, y = 5;
		int result = x * y / 2 + x - y;
		System.out.println(result);

		/*
		 * float a = 9.5f; double b = 2; System.out.println(a / b);
		 */

		/*
		 * int a = 7; int b = 2; int c = a++ - --b; System.out.println(c);
		 */

		int a = 3;
		int b = 2;
		int c = 5;
		int num = a * b + c / a - b * c;
		System.out.println(num);

	}

}
