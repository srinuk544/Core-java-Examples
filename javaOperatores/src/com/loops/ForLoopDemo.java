package com.loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		

	//1	// *
	//2	// **
	//3	// ***
	//4	// ****

		for (int i = 1; i <= 4; i++) { //       1           1<=4     2<=4    3       
			for (int j = 1; j <= i; j++) { //                1<=1  1<=2   2<=2  **   ***  
				{
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}
