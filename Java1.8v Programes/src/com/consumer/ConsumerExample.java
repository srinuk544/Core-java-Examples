package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer< String> co=c->System.out.println(c.length());
		co.accept("java is a progarmming lng");
		
	}

}
