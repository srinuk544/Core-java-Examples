package com.CustomisedExcepion;

public class NegativeAmountException extends RuntimeException {
	public NegativeAmountException(String message) {
		super(message);
	}
}
