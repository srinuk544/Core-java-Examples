package com.arrays;

public class ReversArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("to print arrays");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "  ");

		}
		System.out.println("reverseee");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}
	}

}
