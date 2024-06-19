package com.java.practice71;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEmp {
	public static void keyValue() {
		Map<String, Double> nameSalary=new LinkedHashMap<>();
		
		nameSalary.put("John", 55500.97);
		nameSalary.put("Johny", 56500.97);
		nameSalary.put("Mariya", 55501.90);
		nameSalary.put("Johnson", 55510.9);
		nameSalary.put("Johny b", 57000.0);
		
		System.out.println("key(unique) value(map) in insertion order:");
	// if key is not unique output will only be last insertion. but order will be according insertion
// if john is inserted at first and again inserted at last value will be of last but print at first.
		for(Map.Entry<String, Double> ent: nameSalary.entrySet()) {
			System.out.println("key: "+ent.getKey()+" value: "+ent.getValue());
			
		}
		
	}

}
