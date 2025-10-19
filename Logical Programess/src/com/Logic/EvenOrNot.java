package com.Logic;

public class EvenOrNot {
	public static void main(String[] args) {
		int a[] = { 10, 20, 25, 11, 32 };
		System.out.println("odd numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}

		}

		System.out.println("even numbers");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		
		
		int y=25;
		if(y%2==0) {
			System.out.println("even");
			
		}else {
			System.out.println("odd");
		}
	}

}
