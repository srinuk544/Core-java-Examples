package com.Exceptions;

public class TryWithMultipleCatchBlocksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.out.println("null pointer exception");
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex out of Exception");
			// TODO: handle exception
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception catch block will be excituted");
			System.out.println(e);
		}

	}

}
