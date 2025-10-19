package com.arrays;

public class EvenAndOddCounts {

	public static void main(String[] args) {
		int i = 123468725;

		int even = 0;
		int odd = 0;

		while (i > 0) {
			int sum = i % 10;
			if (sum % 2 == 0) {
				even++;
			} else {
				odd++;
			}
i=i/10;
			
		}
		System.out.println("even numbers:" + even);

		System.out.println("odd numbers:" + odd);

	}
}
