package com.test;

import java.util.Scanner;

public class PalidromeAStringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the input from user");

		String input = sc.nextLine();
		String rev = " ";
	

		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);

		}

		System.out.println("reverse a string:"+rev);
		

		if(input.equals(rev)) {
			System.out.println("is a Palidrome String");
			
		}else {
			System.out.println("not a palidrome");
		}
		sc.close();
	}

}
