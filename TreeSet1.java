package com.java.practice71;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void addNumToSet() {
		Set<Integer> addNum=new TreeSet<>();
		addNum.add(10);
		addNum.add(1);
		addNum.add(40);
		addNum.add(5);
		addNum.add(6);
		addNum.add(7);
		
		System.out.println("treeSet number unique and ordered");
		for(int i: addNum) {
			System.out.println(i);
		}
	}

}
