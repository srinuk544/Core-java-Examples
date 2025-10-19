package com.Logic.sd2;

import java.util.Scanner;

public class PalidromeNumberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");

		int input = sc.nextInt();
		int original = input;
		int rev = 0;
		while (input > 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}

		if (original == rev) {
			System.out.println("Is a palidrome number");

		} else {
			System.out.println("Not a Palidrome number");
		}
	}

}
