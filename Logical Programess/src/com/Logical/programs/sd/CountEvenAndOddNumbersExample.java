package com.Logical.programs.sd;

public class CountEvenAndOddNumbersExample {

	public static void main(String[] args) {
		int num = 12345678;
		int even = 0;
		int odd = 0;

		while (num > 0) {
			int sum = num % 10;
			if (sum % 2 == 0) {
				even++;

			} else {
				odd++;
			}
			num = num / 10;

		}
		System.out.println("Even numbers  count:" + even);
		System.out.println("Odd numbers count:" + odd);
	}
}
