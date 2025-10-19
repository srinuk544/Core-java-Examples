package com.Logical.programs.sd;

import java.util.Scanner;

public class FctrorialNumberExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int num = sc.nextInt();

		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("Factorial of a number is :" + factorial);
	}

}
