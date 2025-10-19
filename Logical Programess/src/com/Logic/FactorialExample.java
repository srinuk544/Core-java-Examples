package com.Logic;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numberr");
		int input = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact *= i;

		}
		System.out.println("factores:" + fact);

	}

}
