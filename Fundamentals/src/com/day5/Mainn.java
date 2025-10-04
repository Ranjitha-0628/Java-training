package com.day5;   //Abstraction 

interface Vehicle{   //Interface 
	void start();    //public & abstract by default 
}
class Bike implements Vehicle{
	public void start() {    //must be public when implementing
		System.out.println("Bike Started");
	}
}
public class Mainn {

	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.start();
	}
}
//Contracts -> implement -> public