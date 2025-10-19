package OverridingExamples;

public class Child extends Parent{
	public void marry() {
		System.out.println("9thara");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.property();
		p.marry();
		Child c=new Child();
		c.property();
		c.marry();
		
	}

}
