package com.stringjoinner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerWithSufxandPrifx {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-", "[", "]");
		sj.add("java");
		sj.add("python");
		sj.add("Dsa");
		sj.add(".Net");
		System.out.println(sj);
		
		String[] elements = sj.toString().split(", ");

		
		List<String> l=Arrays.asList(sj.toString().split(" ,"));
		
        // Iterate using enhanced for-loop
        for (String s : l) {
            System.out.println(s);
	}
	}
}
