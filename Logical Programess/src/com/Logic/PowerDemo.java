package com.Logic;

import java.util.Scanner;

public class PowerDemo {
	public static void main(String[] args) {/*
											 * Scanner console = new Scanner(System.in);
											 * 
											 * int base; int power; int result = 1;
											 * 
											 * System.out.print("Enter the base number "); base = console.nextInt();
											 * 
											 * System.out.print("Enter the power "); power = console.nextInt();
											 * 
											 * for(int i = 1; i <= power; i++) { result *= base; }
											 * 
											 * System.out.println("Result: "+ result);
											 * 
											 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		System.out.println("enter the power");
		int base;
		int power = sc.nextInt();
		base = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= power; i++) {
			res *= base;

		}
		System.out.println(res);

	}
}