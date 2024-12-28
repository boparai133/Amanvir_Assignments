package com.learn.automation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import com.learn.automation.model.AgeNotZeroException;
import com.learn.automation.model.Calculation;
import com.learn.automation.model.ClassB;
import com.learn.automation.model.ComputerTeacher;
import com.learn.automation.model.Teacher;

public class Assignment5 {

	public Assignment5() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	//Question: 1.a
		DivideByZeroException();
		//Question: 1.b
		NullPointerException();
		//Question: 1.c
		ArrayIndexOutOfBoundsExample();
		
		//Question: 2
		HandleIOException();
		HandleInterruptedException();
		
		//Question: 3
		HandleAgeNotZeroException();	 
		 	
	}	
	
	//Question: 1.a
	static void DivideByZeroException()
	{
				
		try {
			int a = 100/0;		
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number divide by zero exception : " + e.getMessage());
		}
		finally {
			System.out.println("DivideByZeroException() finally code block");
		}
	}
	
	//Question: 1.b
	static void NullPointerException()
	{				
		try {
			int[] num = null;			
			System.out.println(num.length);
		}		
		catch(NullPointerException e) {
			System.out.println("Null pointer exception : " + e.getMessage());
		}		
		finally {
			System.out.println("NullPointerException() finally code block");
		}
	}
	
	//Question: 1.c
	static void ArrayIndexOutOfBoundsExample()
	{				
		try {
			int[] arrInt = new int[5];		
			arrInt[10] = 100;
		}		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds exception : " + e.getMessage());
		}		
		finally {
			System.out.println("ArrayIndexOutOfBoundsException() finally code block");
		}
	}
		
	//Question: 2
	//Example 1 
	static void ThrowIOExceptionExample() throws IOException {
		FileReader rdr = new FileReader("C:\\Testfile.txt");
		try (BufferedReader buffrdr = new BufferedReader(rdr)) {
			System.out.println(buffrdr.readLine());
		}
	}
	
	static void HandleIOException(){
		try {
			ThrowIOExceptionExample();
		}
		catch(Exception e){
			System.out.println("Catch block of HandleIOException() :"+e.getMessage());
		}
		
	}
	
	//Example 2
	static void ThrowInterruptedExceptionExample() throws InterruptedException {							
			System.out.println("Print Line 1:");
			System.out.println("Print Line 2:");
			System.out.println("Print Line 3:");
			System.out.println("Print Line 4:");
			Thread.currentThread().interrupt();
			if(Thread.interrupted())
				throw new InterruptedException();
			System.out.println("Print Line 5:");
			System.out.println("Print Line 6:");
			System.out.println("Print Line 7:");	
	}
	
	static void HandleInterruptedException(){
		try {
			ThrowInterruptedExceptionExample();
		}
		catch(Exception e){
			System.out.println("Catch block of HandleInterruptedException(): Current thread interrupted using Thread.currentThread().interrupt();");
		}
		
	}	
	
	//Question: 3
	static void ThrowAgeNotZeroException() throws AgeNotZeroException {
		 
		System.out.println("Enter age:");
		var sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<=0){
			throw new AgeNotZeroException("Age can not be equal to or below zero");
		}
		else
			System.out.println("Age is: "+age);
			
	}
	
	static void HandleAgeNotZeroException(){
		try {
			ThrowAgeNotZeroException();
		}
		catch(Exception e){
			System.out.println("Catch block of HandleAgeNotZeroException() :"+e.getMessage());
		}
		
	}	
}