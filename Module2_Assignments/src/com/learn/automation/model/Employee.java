package com.learn.automation.model;

public class Employee {
	
	public int eid;
	public String jobtitle;
	public String name;
	public double salary;
	
	
	public Employee()
	{
		
	}
	
	public void display()
	{
		System.out.println("Employe Id: "+ eid);
		System.out.println("Employe Job Title: "+ jobtitle);
		System.out.println("Employe Name: "+ name);
		System.out.println("Employe Salary: "+ salary);
	}
	

}
