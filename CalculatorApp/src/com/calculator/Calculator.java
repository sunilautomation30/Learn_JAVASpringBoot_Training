package com.calculator;

public class Calculator {
	
	public void add (int a, int b) {		
		int result = a + b;		
		System.out.println("Adition Of Two Number Is :" + result);		
	}
	
	public void  substraction(int a, int b) {
		int result = a - b;		
		System.out.println("Substraction Of Two Number Is :" + result);		
	}

	
	public void multiply(int a, int b) {		
		int result = a * b;
		System.out.println("Multiplication Of Two Number Is :" + result);		
	}
	public void division(int a, int b) {
		int result = a / b;
		System.out.println("Division Of Two Number Is : "+ result);
	}
	public void square(int a ) {
		int result = a * a;		
		System.out.println("Square Of A Number Is : "+ result);
	}
	public void cube(int a) {
		int result = a * a * a;
		System.out.println("Cube Of A Number Is : "+ result);
	}
	
	
	
	
}
