package com.Logic.sd2;

import java.util.Scanner;

public class PalidromeStringExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();
		String original = input;

		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);

		}
		if (original.equals(rev)) {
			System.out.println("Is a palidrome String ");
		} else {
			System.out.println("Not a Plaidrome String");
		}
	}
}
