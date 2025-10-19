package com.MultiThreadingExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			al.add(i);

		}
		//System.out.println(al);
		Iterator<Integer> ll = al.iterator();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		while (ll.hasNext()) {
			Integer o = (Integer) ll.next();
			// System.out.println(o);

			if (o % 2 == 0) {
				even.add(o);
				// System.out.println("even numbers" + o);

			} else {
				odd.add(o);
				// System.out.println("odd numbers" + o);
			}

		}
		System.out.println("Even numbers :"+even);
		System.out.println("Odd numbers: "+odd);

	}

}
