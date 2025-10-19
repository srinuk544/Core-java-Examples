package com.CustomisedExcepion;

public class BankDEMO {
	static void deposite(double amount) {
		if (amount < 0) {
			throw new NegativeAmountException("We cann't accept the negetive amount right now:!!!!!!!!");

		}
		System.out.println("Deposite amount is:" + amount);
	}

	public static void main(String[] args) {
		deposite(100);
		deposite(-200);
	}
}
