package com.loops;

public class DoWhileArrayExample {
    public static void main(String[] args) {
		/*
		 * String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"}; int i
		 * = 0; do { System.out.println(fruits[i]); i++; // Increment the index } while
		 * (i < fruits.length);
		 */
        
        
        
        
		/*
		 * for (int i = 1; i <= 4; i++) { if (i % 2 == 0) continue; for (int j = 1; j <=
		 * 3; j++) { if (j == 2) break; System.out.print(i + "," + j + " "); } }
		 */
    	
    	
		/*
		 * int i = 0; while (i < 5) { i++; if (i == 3 || i == 5) continue;
		 * System.out.print(i + " "); }
		 */

    	
    	
    	
		/*
		 * for (int i = 1; i <= 3; i++) { switch (i) { case 1: case 3:
		 * System.out.println("Processed"); break; case 2: continue; } }
		 */
    	
    	
    	
    	for (int i = 1; i <= 5; i++) {
    	    if (i % 2!= 0) {
    	        continue;
    	    }
    	    System.out.print(i * 2 + " ");
    	}


    }
}
