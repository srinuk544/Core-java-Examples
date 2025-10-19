package com.Logical.programs.sd;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int a = String.valueOf(num).length();

		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, a);
			num /= 10;

		}

		if (original == sum) {
			System.out.println("is arm strong number");

		} else {
			System.out.println("not yet");
		}
	}

}
