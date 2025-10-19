package com.test1;

import java.util.Scanner;

public class FibonnacciseriesExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the numberr");
		int num = sc.nextInt();

		int prev = 0;
		int next = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(prev + " ");
			int sum = prev + next;
			prev = next;
			next = sum;

		}

		
	}

}
