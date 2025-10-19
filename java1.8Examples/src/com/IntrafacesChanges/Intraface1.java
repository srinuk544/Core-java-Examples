package com.IntrafacesChanges;

public interface Intraface1 {
	public default void start() {
		System.out.println("vechicle startedd");
	}

	public static  void colour() {
		System.out.println("vechicle colour is RED");
	}
}
