package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class SumOfAllDigitsExample {

	public static void main(String[] args) {
		int num = 123456789;
		int sum1 = String.valueOf(num).chars().map(i -> i - '0').sum();
		System.out.println(sum1);

		/*
		 * int sum = 0; while (num > 0) { sum += num % 10; num /= 10;
		 * 
		 * } System.out.println(sum);
		 */
		
		
		
		
		
		
	}
}
