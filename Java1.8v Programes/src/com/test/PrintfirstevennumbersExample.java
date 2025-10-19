package com.test;

import java.util.Scanner;

public class PrintfirstevennumbersExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("even numbers from " + i);

			} else {
				System.out.println("oddd numbers"+i);
			}

		}

	}

}
