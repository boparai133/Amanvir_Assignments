package com.learn.automation.midtermexam;

public class TaxCalculator extends Calculator {

	public TaxCalculator() {
		// TODO Auto-generated constructor stub	
		
	}
	
	public double Add(int a, int b) {
		double plusTax = (a + b) * 1.13; 
		return plusTax;		
	}
	
	public double Subtract(int a, int b) {
		double plusTax = (a - b) * 1.13; 
		return plusTax;			
	}
	
	public double Add(double a, double b) {		
		return a + b;
	}
	

}
