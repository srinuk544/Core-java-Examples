package com.Logical.programs.sd;

import java.nio.file.attribute.AclEntry;

public class PrintEvenAndOddNumbersInArray {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 4, 8, 11, 55 };

		System.out.println("Even numbers");
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println(i + "  ");

			}

		}

		System.out.println("Odd numbers");
		for (int j : a) {
			if (j % 2 != 0) {
				System.out.println(j + "   ");

			}

		}

		System.out.println("even numbers:");

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);

			}

		}

		System.out.println("odd numbers:");

		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] % 2 != 0) {
				System.out.println(a[j]);

			}

		}

	}
}
