package org.simplilearn.calci;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase{

	public void testAdd() {
		Calculator calculator = new Calculator();
		int sum =calculator.add(20, 10);
		Assert.assertEquals(30, sum);
	}
	
	public void testDivision() {
		Calculator calculator = new Calculator();
		int div = calculator.div(20, 5);
		Assert.assertEquals(4, div);
	}
	public void testDivisionByZero() {
		Calculator calculator = new Calculator();
		int div = calculator.div(20, 0);
		Assert.assertEquals(0, div);
	}
	
	
}
