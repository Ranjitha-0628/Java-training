package com.day6;  //Constructor

class Student {
	String name;   //instance variable 
	int usn;
	
	Student(String n, int m){   //Constructor -> runs when the object is created 
		name = n;      //assigns value from parameter to instance variable
		usn = m;	
	}
	void display() {     //method to display 
		System.out.println("Student details \n" +"Name:"+ name + "Usn:" + usn);
	}
}
public class Main {

	public static void main(String[] args) {
		Student s = new Student(" Ranjitha \n",81); //Sets name and usn
		s.display();
	}
}
