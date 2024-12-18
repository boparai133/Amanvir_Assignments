package com.learn.automation.model;
import com.learn.automation.interfaces.*;

public class Calculation implements A,B {
	
	int n1;
	int n2;
	int n3;
	double x;
	double y;
	double z;
	
	//default constructor
	public Calculation() {}
	
	//Part 1 Question 2.
	//constructor
	public Calculation(int n1, int n2, int n3 ) {
		this.n1 =  n1;
		this.n2 = n2;
		this.n3 = n3;		
	}

	public void Sum()
	{
		int sum = n1+n2+n3;		
		System.out.println("The sum of n1,n2,n3 is: "+ sum);
	}
	// End of Part 1 Question 2.
	
	//Classes (Part 2)
	public void Sum(int n1,int n2)
	{
		int sum = n1+n2;		
		System.out.println("The sum of int n1,n2 is: "+ sum);
	}
			
	public void Sum(int n1, int n2, int n3)
	{
		int sum = n1+n2+n3;		
		System.out.println("The sum of int n1,n2,n3 is: "+ sum);
	}
	
	public void Sum(double x,double y)
	{
		int sum = n1+n2;		
		System.out.println("The sum of double x,y is: "+ sum);
	}
	
	public void Sum(double x, double y, double z)
	{
		int sum = n1+n2+n3;		
		System.out.println("The sum of double x,y,z is: "+ sum);
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}
	
	
// Question 2: of assignment 4
	@Override
	public void mul() {
		// TODO Auto-generated method stub		
		System.out.println("mul() of interface B.x: "+ B.x +" and B.y: "+ B.y+ " is: "+(B.x * B.y));
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add() of interface A.a: "+A.a+" and A.b: "+A.b+" is: "+(A.a + A.b));
	}
	
	
	
}
