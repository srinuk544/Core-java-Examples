package com.arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3, 55, 100 };
		System.out.println("normal elemnet"+a);
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			// Compare elements of array with max
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Largest element present in given array: " + max);
	}

}