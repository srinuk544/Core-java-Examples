package com.Excepion.Examples;

import java.io.FileNotFoundException;

public class TryWithMultipleCatchBlocksExample {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			// catch (FileNotFoundException e) {
			// TODO: handle exception
			// System.out.println("file");
			// catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(10 / 2);
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());

		}

	}

}