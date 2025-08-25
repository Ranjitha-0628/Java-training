package com.tnsif.lambdaExpression;

public class MainMethod {
	public static void main(String[] args)
	{
		Message m =()->{return "welcome";};
		System.out.println(m.greet());
	}

}
