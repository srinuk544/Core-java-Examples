package com.test;

import java.util.Scanner;

public class CountEvenAndOddNumbersExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input from user:");
		int input = sc.nextInt();
		int even = 0;
		int odd = 0;

		while (input > 0) {
			int sum = input % 10;
			if (sum % 2 == 0) {
				even++;

			} else {
				odd++;
			}
			input = input / 10;

		}

		System.out.println("Even numbers count:" + even);
		System.out.println("odd numbers count:" + odd);
	}

}
