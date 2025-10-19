package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithFillterExample2 {
	private String name;
	private int age;

	public StreamWithFillterExample2(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "StreamWithFillterExample2 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		StreamWithFillterExample2 n1 = new StreamWithFillterExample2("srinu", 24);
		StreamWithFillterExample2 n2 = new StreamWithFillterExample2("venu", 26);
		StreamWithFillterExample2 n3 = new StreamWithFillterExample2("Akhil", 18);
		StreamWithFillterExample2 n4 = new StreamWithFillterExample2("vasu", 10);
		StreamWithFillterExample2 n5 = new StreamWithFillterExample2("battu", 25);
		StreamWithFillterExample2 n6 = new StreamWithFillterExample2("charitha", 22);
		StreamWithFillterExample2 n7 = new StreamWithFillterExample2("surekha", 24);
		System.out.println("==================Berofe Stream operation:============");
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		System.out.println(n4.toString());
		System.out.println(n5.toString());
		System.out.println(n6.toString());
		System.out.println(n7.toString());
		System.out.println("==============After Stream operation====================");

		List<StreamWithFillterExample2> names = Arrays.asList(n1, n2, n3, n4, n5, n6, n7);
		names.stream().filter(i -> i.age > 18).filter(i->i.name.startsWith("s")).forEach(i -> System.out.println(i));

	}

}
