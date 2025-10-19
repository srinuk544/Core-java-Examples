package com.arrays;

public class StaticVariables {
	/*
	 * static int i=15;
	 * 
	 * public static void main(String[] args) { StaticVariables s=new
	 * StaticVariables(); System.out.println(s.i);
	 * System.out.println(StaticVariables.); System.out.println(i); }
	 */

	int i=10;
	static  int y=20;
	public static void main(String[] args) {
		
		StaticVariables s=new StaticVariables();
		s.i=555;
		s.y=666;
		StaticVariables ss=new StaticVariables();
		
		System.out.println(ss.i+"-----"+ss.y);
	}
}
