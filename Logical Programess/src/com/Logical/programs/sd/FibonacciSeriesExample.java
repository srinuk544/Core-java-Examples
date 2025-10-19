package com.Logical.programs.sd;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int prev=0;
		int next=1;
		for(int i=1;i<=num;i++) {
			System.out.println(prev+" ");
			int sum =prev+next;
			prev=next;
			next=sum;
			
			
		}

	}

}
