package com.interfaces;

public interface Vechile {
	void move();
	//void sound();
	
	  default void speed() {                            // in 8 default methods introduced
		System.out.println("speed by 120");
	}
	
	  
	  static void range() {
		  System.out.println(" max range is 160");
		  
	  }

}
