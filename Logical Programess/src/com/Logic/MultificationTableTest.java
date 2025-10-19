package com.Logic;

import java.util.Scanner;

public class MultificationTableTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int input = sc.nextInt();

		for (int i = 1; i <= 20; i++) {
			System.out.println(input + " x" + i + "=" + (input * i));

			System.out.println(input + "x" + i + "=" + (input * i));

		}
	}

}
