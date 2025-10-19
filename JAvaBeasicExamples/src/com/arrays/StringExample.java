package com.arrays;

public class StringExample {

	
	public static void main(String[] args) {
		
		
		char[] c= {'s','r','i','n','u'};
		
		String s=new String(c);
		System.out.println(s);
		
		
		String ss="hello";
		String sss="world";
		
		System.out.println(ss.concat(sss).length());
		System.out.println();
		
	}
}
