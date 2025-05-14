package com.tns.day3;

import java.util.Scanner;

public class PersonDemo {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);// inputing data , scanner is a pre defined class, can check all other work it does right click and open declaration
		System.out.println("Enter the name");
		String name = obj.next();
		System.out.println("Enter the income");
	    int income = obj.nextInt();
	    System.out.println("Enter the gender");
	    String gender = obj.next();
	    System.out.println("Enter the age");
	    int age = obj.nextInt();
	    System.out.println("Enter the tax");
	    int tax = obj.nextInt();
	    
	    Person p = new Person();
	    p.setName(name);
	    p.setAge(age);
	    p.setGender(gender);
	    p.setIncome(income);
	    p.setTax(tax);
	    
	    p.getName(name);
	    p.getAge(age);
	    p.getGender(gender);
	    p.getIncome(income);
	    p.getTax(tax);
	    System.out.println(p);
	    
	    
	    }

}
