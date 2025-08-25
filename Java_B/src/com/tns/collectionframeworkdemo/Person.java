package com.tns.collectionframeworkdemo;

public class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age= age;
		
	}
	void displayinfo() {
		System.out.println("name: " +name+" age: "+age);
	}
	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return other.name.compareTo(this.name);
	}
	
}