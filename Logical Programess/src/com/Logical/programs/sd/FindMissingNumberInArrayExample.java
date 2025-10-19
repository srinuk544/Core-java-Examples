package com.Logical.programs.sd;

public class FindMissingNumberInArrayExample {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5 };

		int sum1 = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum1 = sum1 + a[i];
			System.out.println(sum1);

		}
		System.out.println("------------");
		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
			System.out.println(sum2);

		}

		int sum3 = sum2 - sum1;
		System.out.println(sum3);
	}
}
