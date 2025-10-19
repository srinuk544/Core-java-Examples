package com.FunctionalIntraface;

import java.util.function.Predicate;

public class PredicateEx1 {

	private String name;
	private int age;
	//private String address;

	public PredicateEx1(String name, int age) {
		this.name = name;
		this.age = age;
		//this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Predicate<Integer> pt = a -> (a % 2 == 0);
		 * System.out.println("is a even number:" + pt.test(6));
		 */
		PredicateEx1 p1=new PredicateEx1("srinu",24);
		PredicateEx1 p2=new PredicateEx1("vasu",18);
		PredicateEx1 p3=new PredicateEx1("venu",26);
		PredicateEx1 p4=new PredicateEx1("hari",25);
		PredicateEx1 p5=new PredicateEx1("venkat",30);
		
		   Predicate<PredicateEx1> startsWithV = person -> person.name.startsWith("v");

	        PredicateEx1[] people = {p1, p2, p3, p4, p5};

	        System.out.println("People whose names start with 'v':");
	        for (PredicateEx1 person : people) {
	            if (startsWithV.test(person)) {
	                System.out.println(person);
	            }
	        }
	    }
	}