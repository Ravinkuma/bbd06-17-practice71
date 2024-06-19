package com.java.practice71;

public class AdvancedMathOperations extends MathOperations {
	@Override
	public int add(int a,int b) {
		int sum=super.add(a, b);
		return sum+5;
	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum of three integers: "+sum);
	}

}
