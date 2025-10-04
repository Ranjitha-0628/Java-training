package com.day4; //Polymorphism 

class MathOperations{  //compile-time polymorphism, /method overloading
	int add(int a, int b) { //same methods with different parameters
		return a + b;
	}
	double add(double a, double b) { 
		return a + b;
	}
}
public class Main {

	public static void main(String[] args) {
		MathOperations m = new MathOperations();
		System.out.println(m.add(2.1, 0.5));
		System.out.println(m.add(13, 8));
	}
}
