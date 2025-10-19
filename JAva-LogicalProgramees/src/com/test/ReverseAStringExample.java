package com.test;

import java.util.Scanner;

public class ReverseAStringExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input from user:");
		String input = sc.nextLine();

		String rev = "  ";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);

		}
		System.out.println("Reverse a String" + rev);

		
		System.out.println("----------------------------");
		
		String x="Java is a high level programming lang";
		StringBuffer sb=new StringBuffer(x);
		System.out.println(sb.reverse());
		
		System.out.println("-------------------");
		
		
		String o="java is Object orintend ";
		
		StringBuilder sbd=new StringBuilder(o);
		System.out.println(sbd.reverse());
	}
	
	


}
