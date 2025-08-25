package com.tns.day8;

public class Square extends Shape {

	private float side;
	public Square() {
		side=2.0f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	void calArea() {
		
		// TODO Auto-generated method stub
		area=side*side;
	
		// TODO Auto-generated method stub
		
	}
}
