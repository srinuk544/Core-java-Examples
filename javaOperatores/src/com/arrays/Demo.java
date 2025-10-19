package com.arrays;

public class Demo {
	public static void main(String[] args) {
		/*
		 * int[] arr = {5, 10, 15, 20}; int sum = 0; for (int i : arr) { sum += (i % 2
		 * == 0) ? i : 0; } System.out.println(sum);
		 */
		/*
		 * int[] arr = {1, 2, 3, 4, 5}; if (arr[2] % arr[0] == 0 || arr[4] / arr[1] ==
		 * 2) { System.out.println("Condition Met"); } else {
		 * System.out.println("Condition Not Met"); }
		 */



		/*
		 * int[] arr = {10, 20, 30, 40, 50}; int index = 2; if (arr[index] % 2 == 0) {
		 * arr[index] += 5; } else { arr[index] -= 5; } System.out.println(arr[index]);
		 * 
		 * 
		 * int[] arri = {10, 20, 30, 40, 50}; int x = 2, y = 4; if (arri[x] < arri[y] &&
		 * arri[x] > arri[0]) { System.out.println(arri[x] + arri[y]); } else {
		 * System.out.println(arr[0]); }
		 */
		
		
		/*
		 * int[] arr = {10, 20, 30, 40, 50}; int sum = 0, i = 0; while (i < arr.length)
		 * { sum += arr[i] % 3 == 0 ? arr[i] / 3 : arr[i] / 2; i++; }
		 * System.out.println(sum);
		 */

		
		/*
		 * int[] arr = {3, 6, 9, 12}; int x = 10; if (arr[1] % 3 == 0 || x % 5 == 0) { x
		 * += arr[2]; } else { x -= arr[0]; } System.out.println(x);
		 */

         
         
         
         
		/*
		 * int[][] arr = {{1, 2}, {3, 4}, {5, 6}}; int sum = 0; for (int i = 0; i <
		 * arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { if (arr[i][j] %
		 * 2 == 0) { sum += arr[i][j]; } } } System.out.println(sum);
		 */

		int[] arr = {2, 4, 6, 8};
        int x = (arr[0] > arr[2]) ? arr[0] : (arr[1] < arr[3] ? arr[1] : arr[2]);
       System.out.println(x); 

       
       
       
       
       
       
       String s="srinu";
       String rev=" ";
       for(int i=s.length()-1;i>=0;i--) {
    	  rev +=s.charAt(i);
    	   
       }
       System.out.println(rev);
	}

}
