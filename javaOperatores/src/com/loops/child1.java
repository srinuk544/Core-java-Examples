package com.loops;

public class child1 extends child {

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
		System.out.println("m method");
	}
	
	
	public void m3() {
		System.out.println(" m3 method ");
	}
	
	public static void main(String[] args) {
		 child1 c=new child1();
		 c.m();
		 c.m1();
		 child cc=new child1() ;
		 cc.m();
		 cc.m1();
		
		 
		
		 }

}

