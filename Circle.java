package com.java.practice71;

public class Circle extends Shape implements Drawable,Movable {
      double radius;
      
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void move() {
		System.out.println("Moving the circle to new position");
		
	}

	@Override
	public void drow() {
		System.out.println("Drowing the circle with radius: "+radius);
		
	}

	@Override
	double calculateArea() {
		
		return 3.14*radius*radius;
	}

}
