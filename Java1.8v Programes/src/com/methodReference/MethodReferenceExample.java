package com.methodReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(2);

		System.out.println("Before sorting:" + al);

		Collections.sort(al, new numberopertator());
		System.out.println("after sorting:" + al);

	}
}

class numberopertator implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) {

		//return i.compareTo(j);   accending order 
return j.compareTo(i);   // deseecending order
	}
}