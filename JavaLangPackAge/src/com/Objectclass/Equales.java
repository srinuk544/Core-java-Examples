package com.Objectclass;

public class Equales {
	String name;
	int roll;

	Equales(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equales e = new Equales("Srinu", 100);
		Equales e1 = new Equales("katta", 101);
		Equales e2 = new Equales("hari", 102);
		Equales e3 = new Equales("cnu", 103);
		Equales e4 = new Equales("vani", 104);
		Equales e5 = new Equales("Srinu", 100);
		Equales e6 = e;
		System.out.println("--------------to string methodd-----");
		System.out.println(e.toString() + "-" + e1.toString() + "--" + e2.toString() + "--" + e3.toString() + "--"
				+ e4.toString() + "---" + e5.toString());
		System.out.println("---------HashCode method---------");

		System.out.println(e.hashCode() + "--" + e1.hashCode() + "-" + e2.hashCode() + "--" + e3.hashCode() + "---"
				+ e4.hashCode() + "---" + e5.hashCode());

		System.out.println(e.equals(e1));
		System.out.println(e.equals(e2));
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e5));
		System.out.println(e4.equals(e1));
		System.out.println(e3.equals(e1));
		System.out.println(e.equals(e5));
		System.out.println(e.equals(e6));
	}

}
