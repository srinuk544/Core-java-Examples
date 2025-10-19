package com.IntrafacesChanges;

public interface Vechile {
	public void start();

	default void conditation() {
		System.out.println("Vechile Condition is very good");
	}
	
	static void beakdown() {
		System.out.println("Vechile sudddenly beakdown");
	}

}
