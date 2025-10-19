package com.Exceptions;

public class illegalArgumentExceptionexample {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println("is a max thread priority :10");
		t.setPriority(10);
		System.out.println("Because a thread priority is less then or equall to :10"
				+ "if your takeing mare then :10 it will show exception");
		t.setPriority(15);
	}

}
