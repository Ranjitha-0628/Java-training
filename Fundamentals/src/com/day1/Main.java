package com.day1;    //Class & Objects

class Student{      //Blueprint
	String name = "Ranjitha K";    //Property, variable, attribute
	int usn = 81;                  
	
	void study() {                 //Action, method, behaviour
		System.out.println("Student is Studying");
	}
	void type() {                  //Method cannot be inside another method
		System.out.println("Student is typing");
	}
}
public class Main {

	public static void main(String[] args) {
		Student s = new Student();     //Object created 
		System.out.println(s.name);    //Object accessing variable
		System.out.println(s.usn);     
		s.study();                     //Object calling methods
		s.type();
	}
}
