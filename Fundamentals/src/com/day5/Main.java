package com.day5; //Abstraction 

abstract class Animal { //abstract class 
	                    
	void sound() { //no body, only definition
	}     //^ or abstract void sound();
}
class Cat extends Animal{
	void sound() {
		System.out.println("Meow-");
	}
}
public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
	}
}
