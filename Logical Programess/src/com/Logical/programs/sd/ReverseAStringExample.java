package com.Logical.programs.sd;

import java.util.Scanner;

public class ReverseAStringExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		String original = sc.nextLine();
		String rev = " ";
		for (int i = original.length() - 1; i >= 0; i--) {

			rev += original.charAt(i);

		}
		
		System.out.println("Before reverse a string:" + original);
		System.out.println("Afetr reverse string :" + rev);

		
		String s = "srinu";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);

		
		
		
		
		
		
		
		
		
		
		
	}
}
