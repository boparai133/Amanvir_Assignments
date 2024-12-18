package com.learn.automation.model;


public class Student {
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	//default constructor
	public Student()
	{
		 	
	}
		 
	public void GetStuData(int SID, String Sname)	
	{		
		this.SID = SID;
		this.Sname = Sname;				
	}
	
	public void GetStuMarks(int Sub1,int Sub2,int Sub3)	
	{		
		this.Sub1 = Sub1;
		this.Sub2 = Sub2;		
		this.Sub3 = Sub3;	
	}
	
	public void TotalMarks()	
	{	
		int totalMarks = this.Sub1 + this.Sub2 + this.Sub3;		
		System.out.println("Student Id: "+ this.SID);		 
		System.out.println("Student name: "+ this.Sname);
		System.out.println("Marks in Sub1: "+ this.Sub1);
		System.out.println("Marks in Sub2: "+ this.Sub2);
		System.out.println("Marks in Sub3: "+ this.Sub3);
		System.out.println("Total Marks: "+ totalMarks);			
	}
	

}
