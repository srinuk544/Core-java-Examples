package com.test;

import java.util.Scanner;

public class ReverseStringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the  string");
		String input=sc.nextLine();
		String rev=" ";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev +=input.charAt(i);
			
		}
		System.out.println("After rev a String:"+rev);
		
		
		
		
		
		
		String s="java";
		StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());	
	}
	

	
	
	
	
}
