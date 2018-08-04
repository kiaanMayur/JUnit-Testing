package com.capgemini.junit.test;
import com.capgemini.junit.calculator.*;
import org.junit.Assert;
import org.junit.Test;

//test class for division
/*Assert.assertEquals(args 1, args 2) -> it takes 2 arguments, 
args 1 -> actual answer
args 2 -> answer came from defined method*/ 

public class TestDivision {

	@Test
	public void testBothPositve() {		//test for both +ve
		Maths math = new Maths();
		double result = math.divide(4.0, 2.0);
		Assert.assertEquals(2.0, result, 0);
	}
	
	@Test
	public void testBothNegative() {		//test for both -ve
		Maths math = new Maths();
		double result = math.divide(-4.0, -2.0);
		Assert.assertEquals(2.0, result, 0);
	}
	
	@Test
	public void testFirstPositveSecondNegative() {		//test for first +ve second -ve
		Maths math = new Maths();
		double result = math.divide(4.0, -2.0);
		Assert.assertEquals(-2.0, result, 0);
	}
	
	@Test
	public void testBFirstLowerSecondHigher() {		//test for smaller numerator larger denominator
		Maths math = new Maths();
		double result = math.divide(2.0, 4.0);
		Assert.assertEquals(0.5, result, 0);
	}
	
	@Test
	public void testFirstZero() {		//test for numerator = 0
		Maths math = new Maths();
		double result = math.divide(0.0, 2.0);
		Assert.assertEquals(0.0, result, 0);
	}

}
