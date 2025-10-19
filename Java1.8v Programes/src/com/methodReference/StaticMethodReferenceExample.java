package com.methodReference;

import java.util.function.Function;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class StaticMethodReferenceExample {
	public static void main(String[] args) {
		Function<Integer, Double> f=Math::sqrt;
		System.out.println(f.apply(4));
		
		
	}

}
