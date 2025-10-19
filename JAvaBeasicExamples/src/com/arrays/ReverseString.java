package com.arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s="srinu";
		
		String original=s;
		String rev=" ";
		
		for(int i=original.length()-1;i>=0;i--) {
			rev+=original.charAt(i);
			
		}
		
		System.out.println("Before String"+s);
		System.out.println("after :"+rev);
	}
}
