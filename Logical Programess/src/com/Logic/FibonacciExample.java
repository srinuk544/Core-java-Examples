package com.Logic;

import java.util.Scanner;

public class FibonacciExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int input = sc.nextInt();
		int priv = 0;
		int next = 1;
		for (int i = 1; i <=input; i++) {
			System.out.println("okk priv:" + priv);
			int sum = priv + next;
			priv = next;
			next = sum;

		}
		sc.close();
	}
}
