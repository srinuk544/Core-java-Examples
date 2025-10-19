package com.IntrafacesChanges;

public class Vegpizza implements Pizza {

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Veg pizza like vegtables piza");
	}

	public static void main(String[] args) {
		Vegpizza v = new Vegpizza();
		v.type();
		v.tastey();
		Pizza.getpizza();
	}

}
