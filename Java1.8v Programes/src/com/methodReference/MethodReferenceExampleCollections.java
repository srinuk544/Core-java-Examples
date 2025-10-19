package com.methodReference;

import java.util.ArrayList;
import java.util.Collections;

public class MethodReferenceExampleCollections {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(2);

		System.out.println("Before sorting: " + al);

		al.sort((i, j) -> i.compareTo(j));
		System.out.println(al);

		al.sort((i, j) -> j.compareTo(i));

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("deceending ordeer:" + al);
	}

}
