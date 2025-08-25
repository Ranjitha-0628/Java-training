package com.tns.day8.finaldemo;

final class FinalDemo {
	
	void show() {
		System.out.println("Final class cannot be inherited");
	}

}
class final3 extends FinalDemo// final method cannot be inherited 
{
	
}