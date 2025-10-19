package com.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExaample1 {
	public static void main(String[] args) {
		
		Supplier<Integer> randomnum=()-> new Random().nextInt(50);
		System.out.println(randomnum.get());
	}

}
