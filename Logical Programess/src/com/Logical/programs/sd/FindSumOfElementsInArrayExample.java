package com.Logical.programs.sd;

public class FindSumOfElementsInArrayExample {
	public static void main(String[] args) {

		int[] a = { 5, 6, 8, 55, 6 };
		int sum = 0;
		/*
		 * for (int i = 0; i <=a.length-1; i++) { sum = sum + a[i];
		 * 
		 * }
		 */
		for (int num : a) {
			sum=sum+num;
			
			
		}
		System.out.println("sum of elements in an array:" + sum);
	}

}
