package com.Logic.sd2;

import java.util.Scanner;

public class StringReverseEXample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input ");
		String input = sc.nextLine();

		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {

			rev += input.charAt(i);

		}
		System.out.println("After reverse A String:" + rev);
	}

}
