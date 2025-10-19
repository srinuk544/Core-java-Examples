package com.IntrafacesChanges;

public interface Pizza {
	public void type();// normal way with out using default method's

	// By using default method's

	default void tastey() {
		System.out.println("Yammy");
	}

	
	// By using static methods
	
	static void getpizza() {
		System.out.println("one type veg bergar");
	}
}
