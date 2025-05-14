package com.tns.day4.firstpackage;

public class Excecutor {
	public static void main(String[] args) {
		
		Base b1 = new Base();
//		b1.varDefault=40;
//		b1.varPublic=70;
//		b1.varProtected=40;
		b1.setVarPrivate(90); //private cannot be used..but using getter-setter ,we can use
		
		b1.methodDefault();
		
		b1.methodPrivate();
		
		b1.methodProtected();
		
		b1.methodPublic();
		

	}

}


