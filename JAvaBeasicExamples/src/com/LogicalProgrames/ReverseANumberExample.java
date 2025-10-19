package com.LogicalProgrames;

import java.util.Scanner;

public class ReverseANumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input = sc.nextInt();

		int rev = 0;
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;

		}

		System.out.println("Aftrer reverse number:" + rev);

		StringBuffer sb = new StringBuffer(String.valueOf(input));
		System.out.println(sb.reverse());

		StringBuilder s = new StringBuilder(String.valueOf(input));
		System.out.println(s.reverse());
	}

}
