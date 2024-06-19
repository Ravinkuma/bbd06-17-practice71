package com.java.practice71;

public class Main_71 {

	public static void main(String[] args) {
		
         TreeSet1.addNumToSet();
         
         LinkedHashMapEmp.keyValue();
         
		ListOfStudent.addDetailsOfStudent();
		
		
		Circle c1=new Circle(5.5);
		c1.drow();
        c1.move();
		System.out.println("Area of circle1 is: "+c1.calculateArea());
		Circle c2=new Circle(7.7);
		System.out.println("Area of circle2 is: "+c2.calculateArea());
		
		MathOperations m=new MathOperations();
		System.out.println("sum of two integers: "+m.add(5, 7));
		System.out.println("sum of doubles: "+m.add(6.6, 0.0));
		System.out.println("sum of strings: "+m.add("hello", " world!"));
		
		AdvancedMathOperations am=new AdvancedMathOperations();
		System.out.println("override add method and a third number: "+am.add(7, 6));
		am.add(7, 6, 7);
		
		
		TextProcessor.textprocessor("hELLOwORLD");
	}

}
