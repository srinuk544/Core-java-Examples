package com.test1;

import java.util.Scanner;

public class First10OddNumbersExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd numbers:" + i);

			} else {
				System.out.println("Even numbersss:" + i);
			}

		}
	}

}
