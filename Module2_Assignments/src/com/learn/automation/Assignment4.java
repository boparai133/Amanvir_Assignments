package com.learn.automation;
import com.learn.automation.model.*;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tch=new Teacher();
		tch.does();
		
		ComputerTeacher cmpTch = new ComputerTeacher();
		cmpTch.does();;
		
		//Interfaces Question 1
		ClassB instance1 = new ClassB();
		instance1.sum();
		
		//Interfaces Question 2
		Calculation c = new Calculation();
		c.add();
		c.mul();
	}

}
