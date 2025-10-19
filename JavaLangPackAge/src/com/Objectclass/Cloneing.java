package com.Objectclass;

public class Cloneing implements Cloneable {
	int i = 10;
	int j = 70;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cloneing c = new Cloneing();
		Cloneing cc = (Cloneing) c.clone();
		cc.j = 100;
		cc.j = 200;
		System.out.println(c.i + "----" + c.j);
		System.out.println(cc.j + "----------" + cc.j);

	}

}
