package com.calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.add(50,20);
		calculator.substraction(50,20);
		calculator.multiply(50,20);
		calculator.division(50,20);
		calculator.square(20);
		calculator.cube(20);
	}

}
