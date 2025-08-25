package com.tns.day8;

public class Rectangle extends Shape {
	
	private float width, height;
	
	public Rectangle () {
	this.width=0.5f;
	this.height=0.2f;
	
	}
	public Rectangle (float width, float height) {
		this.width=width;
		this.height=height;
		
	}

	@Override
	void calArea() {
		area= width *height;
		
	}
	
	

}
