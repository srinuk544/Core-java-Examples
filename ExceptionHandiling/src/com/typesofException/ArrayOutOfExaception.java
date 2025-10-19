package com.typesofException;

public class ArrayOutOfExaception {
	
	public static void main(String[] args) {
		int[] i=new int[5];		
		try {
			i[6]=100;
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(i[4]=10);
			e.printStackTrace();
		}
	}

}
