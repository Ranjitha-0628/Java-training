package com.tns.collectionframeworkdemo;
import java.util.ArrayList;
import java.util.Collections;

public class Comparabledemo {

	public static void main(String[] args) {
		ArrayList<Person> p = new ArrayList<>();
		
		p.add(new Person("john",30));
		p.add(new Person("anil",27));
		p.add(new Person("baskar",17));

		Collections.sort(p);

		for(Person p1:p) {
			p1.displayinfo();
	
	}

}
}
