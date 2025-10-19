package com.consumer;

import java.util.function.Consumer;

public class Test1 {
	
	public static void main(String[] args) {
		Consumer<String> con=c->System.out.println(c+"good morng");
		
		con.accept("srinu");
		con.accept("vasu");
		con.accept("jahon");
	}

}
