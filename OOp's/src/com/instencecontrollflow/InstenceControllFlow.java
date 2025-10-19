package com.instencecontrollflow;

public class InstenceControllFlow {
	int i = 10;
	{
		methodOne();
		System.out.println("first instence block");
	}
	InstenceControllFlow(){
		System.out.println("const");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//InstenceControllFlow iii=new InstenceControllFlow();

		System.out.println("main methodd");
		/*
		 * InstenceControllFlow iii=new InstenceControllFlow(); iii.methodOne();
		 */
	}

	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println(j);

	}

	{
		System.out.println("second block");
	}
	int j = 1000;

}
