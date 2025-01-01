package com.learn.automation.midtermexam;

public class ScientificCalculator extends Calculator {

	public ScientificCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public double SquareNAddTwoNumbers(int a, int b) {
		int sqrA = a*a;
		int sqrB = b*b;		
		double res = sqrA + sqrB;
		return res;
	}
	
	public double CubeNAddTwoNumbers(int a, int b) {
		int cubeA = a*a*a;
		int cubeB = b*b*b;		
		double res = cubeA + cubeB;
		return res;
	}
	

}
