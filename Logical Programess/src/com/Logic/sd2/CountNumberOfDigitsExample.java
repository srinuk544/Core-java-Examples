package com.Logic.sd2;

import java.util.Scanner;

public class CountNumberOfDigitsExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input = sc.nextInt();

		int count = 0;

		while (input > 0) {
			input = input / 10;
			count++;

		}
		System.err.println("Counting numbers:" + count);
	}

}
