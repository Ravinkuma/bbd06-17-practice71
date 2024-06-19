package com.java.practice71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfStudent {
	public static void addDetailsOfStudent() {
		
	Student s1=new Student("Ajay",7.6);
	Student s2=new Student("Mohit",7.0);
	Student s3=new Student("Raina",6.5);
	Student s4=new Student("Mahi",8.3);
	Student s5=new Student("Virat",8.9);
	
	List<Student> nameGrade =new ArrayList<>();
	nameGrade.add(s1);
	nameGrade.add(s2);
	nameGrade.add(s3);
	nameGrade.add(s4);
	nameGrade.add(s5);
	
	Collections.sort(nameGrade);
	System.out.println("list of student sorted with their grade:");
	for(Student s: nameGrade) {
		System.out.println("Name: "+s.getName()+ " Grade: "+s.getGrade());
	}
}
}