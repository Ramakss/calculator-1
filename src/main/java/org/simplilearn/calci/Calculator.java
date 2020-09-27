package org.simplilearn.calci;


public class Calculator {

	public int add(int i , int j) {
		return i+j;
	}
	
	public int div(int i, int j) {
		if(j ==0) return 0;
		return i/j;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.add(10, 20);
		System.out.println("sum=" + sum);
		int div = calculator.div(20, 5);
		System.out.println("div=" + div);
	}
}
