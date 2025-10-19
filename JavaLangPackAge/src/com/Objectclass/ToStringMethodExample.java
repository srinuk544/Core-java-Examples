package com.Objectclass;

public class ToStringMethodExample {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "ToStringMethodExample [age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		ToStringMethodExample t = new ToStringMethodExample();
		t.setAge(10);
		t.setName("srinu");

		System.out.println(t.toString());
	}

}
