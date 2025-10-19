package com.Logical.programs.sd;

import java.util.Scanner;

public class CountNumberOfDitigesExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input from user");

		int input = sc.nextInt();
		int count = 0;

		while (input > 0) {
			input = input / 10;
			count++;

		}
		System.out.println("After count the number of digits in a number:" + count);

	}
}