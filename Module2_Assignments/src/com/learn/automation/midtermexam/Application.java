package com.learn.automation.midtermexam;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uncomment the corresponding method to for execution as needed
		
		//PartA();
		//PartB_1();
		PartB_2();
			

	}
	
	static void PartA()
	{
		int a=0;
		int b=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1");
		a = sc.nextInt();
		
		System.out.print("\nEnter number 2");
		b= sc.nextInt();
		
				
		int opt;
		System.out.print("Select opeation:\r");
		System.out.print("1 = Addition\r");
		System.out.print("2 = Subtraction\r");
		System.out.print("3 = Multiplication\r");
		System.out.print("4 = Division\r");
		Scanner Scopt = new Scanner(System.in);
		opt = Scopt.nextInt();
		
		Calculator calc = new Calculator();
		double res=0;
		if((opt<1)||(opt>4)) {
			System.out.print("\nPleae enter the number between 1-4");		
			
		}
		else if(opt==1) {
			res = calc.Add(a, b);
			System.out.println("number1 + number2 = "+ res);
		}
		else if(opt==2) {
			res = calc.Subtract(a, b);
			System.out.println("number1 - number2 = "+ res);
		}
		else if(opt==3) {
			res = calc.Multiply(a, b);
			System.out.println("number1 x number2 = "+ res);
		}
		else if(opt==4) {
			try
			{
				res = calc.Divide(a, b);
				System.out.println("number1 / number2 = "+ res);
			}
			catch(ArithmeticException e)
			{
				System.out.print("Divide by zero exception"+ e.getMessage());		
			}
		}
		else {
			System.out.print("Bye...");
		}
			
		
		
	}
	
	static void PartB_1() {
		int a=0;
		int b=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1");
		a = sc.nextInt();
		
		System.out.print("\nEnter number 2");
		b= sc.nextInt();
		
				
		int opt;
		System.out.print("Select opeation:\r");
		System.out.print("1 = Addition\r");
		System.out.print("2 = Subtraction\r");
		System.out.print("3 = Multiplication\r");
		System.out.print("4 = Division\r");
		System.out.print("5 = SquareNAddTwoNumbers\r");
		System.out.print("6 = CubeNAddTwoNumbers\r");
		Scanner Scopt = new Scanner(System.in);
		opt = Scopt.nextInt();
		
		ScientificCalculator calc = new ScientificCalculator();
		double res=0;
		if((opt<1)||(opt>6)) {
			System.out.print("\nPleae enter the number between 1-6");		
			
		}
		else if(opt==1) {
			res = calc.Add(a, b);
			System.out.println("number1 + number2 = "+ res);
		}
		else if(opt==2) {
			res = calc.Subtract(a, b);
			System.out.println("number1 - number2 = "+ res);
		}
		else if(opt==3) {
			res = calc.Multiply(a, b);
			System.out.println("number1 x number2 = "+ res);
		}
		else if(opt==4) {
			try
			{
				res = calc.Divide(a, b);
				System.out.println("number1 / number2 = "+ res);
			}
			catch(ArithmeticException e)
			{
				System.out.print("Divide by zero exception"+ e.getMessage());		
			}
		}
		else if(opt==5) {
			res = calc.SquareNAddTwoNumbers(a, b);
			System.out.println("number1^2 + number2^2 = "+ res);
		}
		else if(opt==6) {
			res = calc.CubeNAddTwoNumbers(a, b);
			System.out.println("number1^3 x number2^3 = "+ res);
		}
		else {
			System.out.print("Bye...");
		}
			
	}
	
	static void PartB_2() {
		int a=0;
		int b=0;
		double x= 0.0;
		double y= 0.0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1");
		a = sc.nextInt();
		
		System.out.print("\nEnter number 2");
		b= sc.nextInt();
		
				
		int opt;
		System.out.print("Select opeation:\r");
		System.out.print("1 = Addition\r");
		System.out.print("2 = Subtraction\r");
		System.out.print("3 = Multiplication\r");
		System.out.print("4 = Division\r");
		System.out.print("5 = Addition +HST\r");
		System.out.print("6 = Subtraction +HST\r");
		System.out.print("7 = Add float numbers and display float\r");
		Scanner Scopt = new Scanner(System.in);
		opt = Scopt.nextInt();
		
		TaxCalculator calc = new TaxCalculator();
		double res=0;
		if((opt<1)||(opt>7)) {
			System.out.print("\nPleae enter the number between 1-6");		
			
		}
		else if(opt==1) {
			res = calc.Add(a, b);
			System.out.println("number1 + number2 = "+ res);
		}
		else if(opt==2) {
			res = calc.Subtract(a, b);
			System.out.println("number1 - number2 = "+ res);
		}
		else if(opt==3) {
			res = calc.Multiply(a, b);
			System.out.println("number1 x number2 = "+ res);
		}
		else if(opt==4) {
			try
			{
				res = calc.Divide(a, b);
				System.out.println("number1 / number2 = "+ res);
			}
			catch(ArithmeticException e)
			{
				System.out.print("Divide by zero exception"+ e.getMessage());		
			}
		}
		else if(opt==5) {
			res = calc.Add(a, b);
			System.out.println("number1 + number2 + 13% = "+ res);
		}
		else if(opt==6) {
			res = calc.Subtract(a, b);
			System.out.println("number1 + number2 + 13% = "+ res);
		}
		else if(opt==7) {
			Scanner scf = new Scanner(System.in);
			System.out.print("Enter floating number 1");
			x = scf.nextFloat();			
			System.out.print("\nEnter floating number 2");
			y= scf.nextFloat();			
			res = calc.Add(x, y);
			System.out.println("Addition of 2 float numbers = "+ res);
		}
		else {
			System.out.print("Bye...");
		}
			
	}
}
