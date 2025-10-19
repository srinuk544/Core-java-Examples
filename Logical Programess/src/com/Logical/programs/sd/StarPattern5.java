package com.Logical.programs.sd;

import java.util.Scanner;

public class StarPattern5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int n = sc.nextInt();
		/*
		 * for (int i = 1; i <= n; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.println(i); } System.out.println(); }
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j);
			}
			System.out.println();
		}
	}
}
