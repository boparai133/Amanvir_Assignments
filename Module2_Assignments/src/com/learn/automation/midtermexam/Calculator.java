package com.learn.automation.midtermexam;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}	
	
	public double Add(int a, int b) {
		return a+b;
		
	}
	
	public double Subtract(int a, int b) {
		return a-b;			
		}
	
	public double Multiply(int a, int b) {
		return a*b;
	}
	
	public double Divide(int a, int b) {
		double res=0;
		try {
			res = a/b;		
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
		return res;
	}
}
