package com.arrays;

import java.util.Arrays;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

 public class Main {
	public static void main(String[] args) {
		/*
		 * int[] arr = {5, 3, 8, 4, 2}; for (int i = 0; i < arr.length - 1; i++) { for
		 * (int j = 0; j < arr.length - i - 1; j++) { if (arr[j] > arr[j + 1]) { int
		 * temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; } } }
		 * System.out.println(Arrays.toString(arr));
		 */

		
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length / 2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - 1 - i];
		    arr[arr.length - 1 - i] = temp;
		}
		System.out.println(arr[0]);

	}
}