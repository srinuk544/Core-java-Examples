package com.Objectclass;

public class EqualesMethodExample {
  
	private int age;
	private String name;
	public EqualesMethodExample(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	
	public void display() {
		System.out.println("Student data :"+name+"----------"+age);
	}
	
	public static void main(String[] args) {
		EqualesMethodExample e1=new EqualesMethodExample(10, "neeraj");
		EqualesMethodExample e2=new EqualesMethodExample(12, "vasu");
		EqualesMethodExample e3=new EqualesMethodExample(10, "neeraj");
		EqualesMethodExample e4=new EqualesMethodExample(12, "vasu");
		EqualesMethodExample e5=e1;
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e5));
		System.out.println(e1==e3);
	}
}
