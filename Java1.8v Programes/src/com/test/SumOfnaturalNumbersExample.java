package com.test;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfnaturalNumbersExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;

		}
		System.out.println(sum);

	}
}
