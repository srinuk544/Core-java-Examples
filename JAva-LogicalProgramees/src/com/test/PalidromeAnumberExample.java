package com.test;

import java.util.Scanner;

public class PalidromeAnumberExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input from user");
		int input = sc.nextInt();

		int original = input;

		int rev = 0;

		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}

		if (original == rev) {
			System.out.println("is a  palidrome number");

		} else {
			System.out.println("Not a  palidrome number");
		}

	}

}
