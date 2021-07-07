package com.wissen.mavendemo;

import java.util.ArrayList;

public class Calculator {
	
	CalculatorList list = new CalculatorList();

	public int add(int a, int b) {
		
		return a+b;
	}
	
	public int sub(int a, int b) {
		
		return a-b;
	}
	
	public int multiply(int a, int b) {
		
		return a*b;
	}
	
	public int div(int a, int b) {
		
		return a/b;
	}
	
	public void addInList(int a) {
		list.addElement(a);
		System.out.println("number a: "+a+" added in list");
	}
	
}
