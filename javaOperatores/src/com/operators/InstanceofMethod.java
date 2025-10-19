package com.operators;
import javax.swing.text.ChangedCharSetException;
class Parent {}
class Child extends Parent {}
public class InstanceofMethod {
	public static void check(Object obj) {
		if (obj instanceof Child) {
			System.out.println("is a child object");

		} else if (obj instanceof Parent) {

			System.out.println("is a parent object");
		} else {
			System.out.println("non of the object");
		}
	}

	public static void main(String[] args) {
		check(new Child());
		check(new Parent());
		check("Hello");
	}
}
