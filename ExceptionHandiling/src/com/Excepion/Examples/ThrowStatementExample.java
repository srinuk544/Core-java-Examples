package com.Excepion.Examples;

import com.Exceptions.illegalArgumentExceptionexample;

public class ThrowStatementExample {
	public static void main(String[] args) {

		try {
			validateAge(16);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Exception already caught:" + e.getMessage());
		}

	}

	private static void validateAge(int age) {
		// TODO Auto-generated method stub
		if (age < 18) {
			throw new IllegalArgumentException("age must be 18 or older to register");

		}
		System.out.println("Age is validate");

	}

}
