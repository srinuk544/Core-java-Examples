package com.arrays;

public class ReversArrayExample1 {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 5 };

		System.out.println("to print array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("revers array");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}

		System.out.println("dupilicatess");
		for (int k = 0; k < a.length; k++) {
			for (int j = k + 1; j < a.length; j++) {
				if (a[k] == a[j]) {
					System.out.println(a[j]);

				}

			}
		}
	}
}
