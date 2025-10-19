package com.Objectclass;

public class HashCode {
	int i;
	String name;

	HashCode(int i, String name) {
		this.i = i;
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCode t = new HashCode(10, "srinu");
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.hashCode());

	}

}
