package com.learn.automation;
import com.learn.automation.model.*;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classes and Objects (Part 1), Question 1.
		System.out.println("[Classes Part 1 Question 1.]");
		Student stu1 = new Student();
		stu1.GetStuData(1,"Student1");
		stu1.GetStuMarks(77, 88, 99);
		stu1.TotalMarks();
		
		Student stu2 = new Student();
		stu1.GetStuData(2,"Student2");
		stu1.GetStuMarks(92, 94, 97);
		stu1.TotalMarks();
		
		//Classes and Objects (Part 1), Question 2.
		System.out.println("[Classes Part 1 Question 2.]");
		Calculation c1 = new Calculation(2,3,4);
		c1.Sum();
		
		//Classes and Objects (Part 2)		
		System.out.println("[Classes Part 2]");
		Calculation cal = new Calculation();
		cal.Sum(12,23);
		cal.Sum(44,44,55);
		cal.Sum(33.50,69.50);
		cal.Sum(33.33,33.33,33.34);	
	}

}
