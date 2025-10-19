package com.Logic.sd2;

import java.util.Scanner;

public class NumberReverseExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int input = sc.nextInt();

		int rev = 0;
		while (input > 0) {
			rev = rev * 10 + input % 10;
			input= input / 10;

			
		}
		
		System.out.println("After reverse a number:" + rev);
	}

}
