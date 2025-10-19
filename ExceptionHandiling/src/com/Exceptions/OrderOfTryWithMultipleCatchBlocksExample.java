package com.Exceptions;

public class OrderOfTryWithMultipleCatchBlocksExample {
	public static void main(String[] args) {
		try {
			int a[] = { 10, 20, 30 };
			System.out.println(a[4]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		/*
		 * catch (ArrayIndexOutOfBoundsException e) { // TODO: handle exception     Exception already cought
		 * System.out.println(e); e.printStackTrace(); }
		 */
	}
}
