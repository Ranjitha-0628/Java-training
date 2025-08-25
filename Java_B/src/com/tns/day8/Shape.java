package com.tns.day8;

public abstract class Shape {
	
	protected float area;
	
	abstract void calArea();// abstract method
	
	void show()// non abstract method
	{
		System.out.println("The area is:"+area);
	}
}
