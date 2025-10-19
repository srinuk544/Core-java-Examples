package com.Objectclass;

import java.util.ArrayList;

public class HashCodeMethodExample {
	private int roll;
	private String name;
	public HashCodeMethodExample(int roll, String name) {
		this.roll=roll;
		this.name=name;
		
	}
	
public int hashcode() {
	return roll;
}
	
	public static void main(String[] args) {
		/*
		 * ArrayList al=new ArrayList<>(); al.add(1); al.add(2);
		 * System.out.println(al.hashCode());
		 */
		
		HashCodeMethodExample h=new HashCodeMethodExample(1, "srinu");
		//System.out.println(h.hashCode());
		System.out.println(h.hashcode());
	}

}
