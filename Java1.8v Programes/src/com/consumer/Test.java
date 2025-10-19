package com.consumer;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		Consumer<String>  con=c->System.out.println(c.toUpperCase());
		con.accept("hello");
	}

}
