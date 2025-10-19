package com.Logic;

import java.util.Scanner;

public class ArmStrongNumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int input = sc.nextInt();
		int sum = 0;
		int original = input;
		int a = String.valueOf(input).length();

		while (input > 0) {
			int digit = input % 10;
			sum += Math.pow(digit, a);
			input /= 10;

		} 
		if (original == sum) {
			System.out.println("is a arm stromg");

		} else {
			System.out.println("not a armstrong");
		}

	}

}
