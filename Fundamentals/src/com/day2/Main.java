package com.day2;

class Student {    //Encapsulation
	private int age;    //hiding data using private
	
	public void setAge(int a) {  //Setter - to set the value
	       age = a;
}
	public int getAge() {    //Getter - to get the value 
		return age;
	}
}
public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(21);  //setting the value 
		System.out.println(s.getAge());   //Prints value
	} 
}


