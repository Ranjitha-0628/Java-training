package com.tnsif.Multithreading;

public class Example {
	synchronized void display() {
		Thread t=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(t.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		}
	}

}