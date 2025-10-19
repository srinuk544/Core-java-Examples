package com.Logical.programs.sd;

import java.util.Scanner;

public class FindThreelargestNumbersExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first number");
		int a = sc.nextInt();

		System.out.println("second number");
		int b = sc.nextInt();

		System.out.println("Third number");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "largest number");

		} else if (b > a && b > c) {
			System.out.println(b + "lagest number");

		} else {
			System.out.println(c + "largest number");
		}
	}

}
