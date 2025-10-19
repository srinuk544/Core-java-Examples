package com.test;

import java.util.Scanner;

public class ReverseNumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input  from user");
		int input = sc.nextInt();

		int rev = 0;
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}
		System.out.println("reverse a number:" + rev);

		System.out.println("----------------------");

		int a = 125;
		StringBuffer sb = new StringBuffer(String.valueOf(a));

		System.out.println("Reverse a number:" + sb.reverse());

		System.out.println("------------------------");

		int y = 123;
		StringBuilder sbd = new StringBuilder(String.valueOf(y));
		System.out.println("Reverse a number:" + sbd.reverse());

	}

}
