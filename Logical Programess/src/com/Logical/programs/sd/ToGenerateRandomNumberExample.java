package com.Logical.programs.sd;

import java.util.Random;

public class ToGenerateRandomNumberExample {
	public static void main(String[] args) {
		 Random ran=new Random();
		 int ron=ran.nextInt(10);
		 System.out.println(ron);
		 
		 double i=ran.nextDouble();
		 System.out.println(i);
		 
	}

}
