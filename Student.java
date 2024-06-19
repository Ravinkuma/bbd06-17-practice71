package com.java.practice71;

public class Student implements Comparable<Student> {
	String name;
	double grade;
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	//The Comparable interface is used to define how a class is to be sorted.
	@Override
	public int compareTo(Student other) {
		
		return Double.compare(this.grade, other.grade);
	}
	//why we use toString();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
    
}
