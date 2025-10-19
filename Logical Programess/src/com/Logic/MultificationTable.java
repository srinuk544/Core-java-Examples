package com.Logic;

import java.util.Scanner;

public class MultificationTable {
	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in); int num;
		 * 
		 * System.out.print("Enter any positive integer: "); num = s.nextInt();
		 * 
		 * System.out.println("Multiplication Table of " + num);
		 * 
		 * for (int i = 1; i <= 10; i++) { System.out.println(num + " x " + i + " = " +
		 * (num * i));
		 * 
		 * }
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the valuee");
		int input = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(input + " x" + i + "=" + (input * i));

		}
	}

}
