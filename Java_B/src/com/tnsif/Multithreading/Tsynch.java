package com.tnsif.Multithreading;

public class Tsynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e=new Example();
		T t1=new T(e);
		T t2=new T(e);
		T t3=new T(e);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
