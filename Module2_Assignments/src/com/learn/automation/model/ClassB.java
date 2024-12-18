package com.learn.automation.model;
import com.learn.automation.interfaces.A;

public class ClassB implements A {

	public ClassB() {
		// TODO Auto-generated constructor stub
		 
		
	}
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("sum() of interface A.a: "+A.a+" and A.b: "+A.b+" is: "+(A.a + A.b));
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
