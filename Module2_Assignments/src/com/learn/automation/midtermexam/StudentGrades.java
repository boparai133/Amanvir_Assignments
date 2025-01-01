package com.learn.automation.midtermexam;

import java.util.HashMap;

public class StudentGrades {

	public StudentGrades() {
		// TODO Auto-generated constructor stub
		
		}
	
	void Search(String name) {
			HashMap<String,Double> hMap= new HashMap<String,Double>();
			hMap.put("Student1", 99.1);
			hMap.put("Student2", 89.2);
			hMap.put("Student3", 90.3);
			hMap.put("Student4", 92.4);
			hMap.put("Student5", 93.5);
			hMap.put("Student6", 94.6);
			hMap.put("Student7", 95.7);
			hMap.put("Student8", 96.8);
			hMap.put("Student9", 98.1);
			hMap.put("Student10", 97.1);
		
			System.out.println(hMap);
			
			if(hMap.containsKey(name))
				System.out.println("Grades of student "+name +" = " + hMap.get(name));
			else
				System.out.println("Student "+name +" does not exist in the HashMap");
			
			hMap.remove(name);
				System.out.println("Student "+name +" removed from HashMap");
			
			System.out.println(hMap);
	
			
	}

}
