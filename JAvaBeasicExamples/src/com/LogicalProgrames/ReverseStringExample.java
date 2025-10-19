package com.LogicalProgrames;

import java.util.Scanner;

public class ReverseStringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");

		String input = sc.nextLine();

		/*
		 * String rev = " ";
		 * 
		 * for (int i = input.length() - 1; i >= 0; i--) { rev += input.charAt(i);
		 * 
		 * } System.out.println("After reverse String :" + rev);
		 */
		
		
		
		StringBuffer sb=new StringBuffer(input);
		System.out.println(sb.reverse());
	}
	
	
	
	

}
