package com.lambda;

public class WithOutLambda implements intraf{

	@Override
	public void m1(int a, int b) {
		// TODO Auto-generated method stub
		
		
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		WithOutLambda w=new WithOutLambda();
		w.m1(10, 20);
		
	}

}
