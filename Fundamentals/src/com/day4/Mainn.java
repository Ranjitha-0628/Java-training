package com.day4;   
class Car {             //Runtime polymorphism, method overriding
	void move() {
		System.out.println("car is moving");
	}
}
class Bike extends Car{
	void move() {
		System.out.println("bike is moving");
	}
}
public class Mainn {

	public static void main(String[] args) {
		Car c = new Bike(); //Bike overriden
		c.move();
	}
}
