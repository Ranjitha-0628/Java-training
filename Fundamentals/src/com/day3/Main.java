package com.day3;      //Inheritance             

class AI{              //parent class
	void subset() {    //method
	System.out.println("ML is a branch of study");
}
}
class ML extends AI {   //child class
	void superset() {   //method 
	System.out.println("AI includes ML");
}
}
public class Main {

	public static void main(String[] args) {
		ML m = new ML(); 
		m.superset();     //Own method
		m.subset();       //inherited method 
	}
}
