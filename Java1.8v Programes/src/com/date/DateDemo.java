package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		 Date d=new Date();
		 System.out.println(d);
		 
		 
		DateFormat dd=new SimpleDateFormat("dd/yyyy/mm");
		String formate=dd.format(d);
		System.out.println(formate);
	}

}
