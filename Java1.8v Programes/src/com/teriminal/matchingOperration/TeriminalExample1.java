package com.teriminal.matchingOperration;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TeriminalExample1 {
	String name;
	String country;

	public TeriminalExample1(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "TeriminalExample1 [name=" + name + ", country=" + country + "]";
	}

	public static void main(String[] args) {
		TeriminalExample1 t1 = new TeriminalExample1("srinu", "india");
		TeriminalExample1 t2 = new TeriminalExample1("jon", "usa");
		TeriminalExample1 t3 = new TeriminalExample1("raj", "india");
		TeriminalExample1 t4 = new TeriminalExample1("king", "uk");

		List<TeriminalExample1> list = Arrays.asList(t1, t2, t3, t4);
		list.stream().filter(i -> i.country.equals("india"))
				.forEach(i -> System.out.println("name of the person belongs to india:::" + i.name));

		Optional<TeriminalExample1> tt = list.stream().filter(i -> i.country.equals("india")).findFirst();
		System.out.println(tt);

		Optional<TeriminalExample1> t = list.stream().filter(p -> p.name.equals("srinu")).findAny();

		System.out.println(t);
		System.out.println("==================getting both country and names================");
		List<TeriminalExample1> ind = list.stream().filter(p -> p.country.equals("india")).collect(Collectors.toList());
	ind.forEach(i->System.out.println(i));

		System.out.println("================only getting the names form the idian===============");
		List<TeriminalExample1> names = list.stream().filter(p -> p.country.equals("india"))
				.collect(Collectors.toList());
		names.forEach(i -> System.out.println(i.name));

	}

}
