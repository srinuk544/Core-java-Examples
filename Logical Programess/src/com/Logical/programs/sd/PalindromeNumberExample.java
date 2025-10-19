package com.Logical.programs.sd;

import java.util.Scanner;

public class PalindromeNumberExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int original_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		// System.out.println(rev);
		if (original_num == rev) {
			System.out.println("is a palidrome number");

		} else {
			System.out.println("not a PalindromeNumber ");
		}

	}
}