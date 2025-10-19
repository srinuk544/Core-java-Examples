package com.Logic;

import java.util.Scanner;

public class PoweringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Base");
		System.out.println("power");
		
		int power=sc.nextInt();
		 int base=sc.nextInt();
		int res=1;
		for(int i=1;i<=power;i++) {
			res *=base;
			
		}
		System.out.println(res);
	}

}
