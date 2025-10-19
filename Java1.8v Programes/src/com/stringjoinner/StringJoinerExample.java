package com.stringjoinner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("java");
		sj.add("python");
		sj.add("SQl");
		sj.add("Devopes");
		System.out.println(sj);
		
		System.out.println("---------------------");
		
		
		StringJoiner stringJoiner=new StringJoiner(",","[","]");
		stringJoiner.add("hyd");
		stringJoiner.add("Chennai");
		stringJoiner.add("Pune");
		stringJoiner.add("Mumbai");
		
		List<StringJoiner> ll=Arrays.asList(stringJoiner);
		ll.forEach(i->System.out.println(i));
		
	}

}
