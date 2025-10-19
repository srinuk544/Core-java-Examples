package com.Logical.programs.sd;

import java.util.Scanner;

public class CheckingByPrimeNumberOrNotExample {
public static void main(String[] args) {
	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
	int num =sc.nextInt();
	int count=0;
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%2==0) {
				count++;
			}if(count==2) {
				System.out.println(" a prime number");
			}else {
				//System.out.println("not a prime number");
			}
			
		}
		
	}
	
}
}