package MethodHiding;

public class Child extends Parent {
	public static void marry() {
		System.out.println("kajol");

	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.property();
		p.marry();

		Child c = new Child();
		c.property();
		c.marry();
	}
}
