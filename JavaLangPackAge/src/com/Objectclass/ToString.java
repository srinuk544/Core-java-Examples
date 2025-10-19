package com.Objectclass;

public class ToString {
	int i;
	String name;

	ToString(int i, String name) {
		this.i = i;
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString t = new ToString(10, "srinu");
		System.out.println(t);
		System.out.println(t.toString());
		
	}

}
