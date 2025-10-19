package com.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PalidromecheckingExample {

	public static void main(String[] args) {
		int i = 131;

		List<Integer> ll = Arrays.asList(i);
		ll.stream().sorted(Comparator.reverseOrder());
		System.out.println(ll);

	}

}
