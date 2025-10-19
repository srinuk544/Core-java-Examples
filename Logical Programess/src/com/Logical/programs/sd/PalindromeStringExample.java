package com.Logical.programs.sd;

import java.util.Scanner;

public class PalindromeStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input from user:");

        String original = sc.nextLine(); // Original string
        String rev = "";
		for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }

		System.out.println("Afet reverse String :" + rev);

		 if (original.equals(rev)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        sc.close(); // Close the scanner
	}
}



