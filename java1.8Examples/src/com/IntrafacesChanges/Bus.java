package com.IntrafacesChanges;

public class Bus implements Intraface1 {
	public void clean() {
		System.out.println("vechicle cleanning");
	}

	public static void main(String[] args) {
		Bus b = new Bus();
		b.start();
		b.clean();
		Intraface1.colour();
	}
}
