package com.stringjoinner;

import java.util.StringJoiner;

public class StringJonierDemo {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(" -");
		sj.add("java");
		sj.add("python");
		sj.add("DSA");
		System.out.println(sj);
		
		
	}
}
