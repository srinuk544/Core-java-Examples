package com.Logical.programs.sd;

import java.util.Scanner;

public class StarPattern4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.println("$");
				} else {
					System.out.println("*");

				}

			}
			System.out.println();

		}
	}
	

}
