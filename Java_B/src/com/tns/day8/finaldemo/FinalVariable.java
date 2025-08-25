package com.tns.day8.finaldemo;

public class FinalVariable {
	int x = 100;
	static int Y;// declaration blank, and not initialised
	final static int Z=10;
	
	void change ()
	{
		x=30;
		Y=100;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	static {
		Y=20;
		System.out.println("Value of Y:"+Y);
	}

}
