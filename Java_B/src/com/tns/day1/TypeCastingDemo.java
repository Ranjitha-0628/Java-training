package com.tns.day1;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		//implicit type casting 
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		//explicit type casting 
		float f1 = 34.56f;
		int f2 = (int)f1;
		System.out.println(f2);
	}

}
