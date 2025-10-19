package com.Logical.programs.sd;

import java.util.Scanner;

public class CheckPrimeNumberOrNotExample {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	int num=sc.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		
	//	System.out.println(i);
		if(num%i==0) {
			count++;
			
			
		}
		
		if(count==2) {
			System.out.println("is a prime number");
			
		}else {
			System.out.println("not a prime ");
		}
		
	}}
}
