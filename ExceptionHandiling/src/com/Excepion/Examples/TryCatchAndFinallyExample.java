package com.Excepion.Examples;

public class TryCatchAndFinallyExample {
	public static void main(String[] args) {
		System.out.println("with out any exceeption");
		try {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}

		System.out.println("Exception rised but cossponding catch block will be matched");
		try {
			System.out.println("try block");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) { // TODO: handle exception
			System.out.println("Catch block");
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block");
		}

		System.out.println("corsponding catch block not matching");
		try {
			System.out.println("try block");
			System.out.println(10 / 0);

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}

	}

}
