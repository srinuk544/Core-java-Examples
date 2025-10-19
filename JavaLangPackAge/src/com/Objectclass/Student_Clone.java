package com.Objectclass;

public class Student_Clone implements Cloneable {
	String name;
	int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void show() {
		System.out.println("Studnet name:" + name + "--" + "student roll:" + roll);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student_Clone s = new Student_Clone();
		s.setName("srinuu");
		s.setRoll(100);
		Student_Clone ss = (Student_Clone) s.clone();
		System.out.println("normall:" + s.getName() + "-----" + s.getRoll());
		System.out.println("After cloned:" + ss.getName() + "-------" + ss.getRoll());
		System.out.println(s.toString());
		System.out.println(ss.hashCode());
		System.out.println(ss.getClass());
	}

}
