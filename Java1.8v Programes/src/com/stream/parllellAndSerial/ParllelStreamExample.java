package com.stream.parllellAndSerial;

import java.util.stream.Stream;import com.lambda.intraface;

public class ParllelStreamExample {

	public static void main(String[] args) {
		System.out.println("=== serial stream====");
		Stream<Integer> s=Stream.of(1,2,3,4,5);
		s.forEach(i->System.out.println(i+  "::" +Thread.currentThread()));
		
		System.out.println("=== parllel stream====");
		Stream<Integer> ss=Stream.of(1,2,3,4,5);
		ss.parallel().forEach(i->System.out.println(i+  "::" +Thread.currentThread()));
		
	}
}
