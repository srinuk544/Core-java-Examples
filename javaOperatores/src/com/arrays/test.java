package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * public class Test { public static void modify(int[] arr) {
 * 
 * for (int i = 0; i < arr.length; i++) { arr[i] *= 2; } }
 * 
 * public static void main(String[] args) { int[] arr = {2, 4, 6}; modify(arr);
 * System.out.println(arr[2]);
 * 
 * 
 * 
 * 
 * 
 * } }
 */

/*
 * public class Test { public static int[] getArray() { int[] arr = new int[3];
 * for (int i = 0; i < arr.length; i++) { arr[i] = i + 1; } return arr; }
 * 
 * public static void main(String[] args) { int[] arr = getArray();
 * System.out.println(arr.length); } }
 */

public class test {
	public static void main(String[] args) {
		Integer[] ii = { 10, 55, 12, 88, 77, 15 };
		// int max=ii[0];
		int min = ii[0];
		/*
		 * for(int i=0;i<ii.length;i++) { if(ii[i]>max) { max=ii[i]; }
		 * 
		 * } System.out.println(max);
		 */

		/*
		 * for (int i : ii) { if (ii[i] < min) { min = ii[i];
		 * 
		 * } System.out.println(min); }
		 */

		List<Integer> ll = Arrays.asList(ii);

		System.out.println("reverse");
		ll.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(i -> System.out.println(i));
		System.out.println("forward");
		ll.stream().sorted().collect(Collectors.toList()).forEach(i -> System.out.println(i));
        int[] arr = {10, 20, 30, 40};
        if (arr[0] > arr[1] & arr[2] < arr[3]) {
               System.out.println("Condition Met");
     } else {
         System.out.println("Condition Not Met");
      }

        
        
        
        int[] arri = {1, 2, 3, 4, 5};
        for (int i = 0; i < arri.length; i += 2) {
          arri[i] *= 2;
    }
      System.out.println(Arrays.toString(arri));

	}
}