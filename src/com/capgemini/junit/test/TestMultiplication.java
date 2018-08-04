package com.capgemini.junit.test;
import com.capgemini.junit.calculator.*;
import org.junit.Assert;
import org.junit.Test;

//test class for multiplication
/*Assert.assertEquals(args 1, args 2) -> it takes 2 arguments, 
args 1 -> actual answer
args 2 -> answer came from defined method*/ 

public class TestMultiplication {

	@Test
	public void testBothPositive() {		//test for both positives
		Maths math = new Maths();
		
		int result = math.multiplication(2,3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testBothNegative() {		//test for both negatives
		Maths math = new Maths();
		
		int result = math.multiplication(-2,-3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testOneNegativeOnePostive() {		//test for first -ive, second +ive
		Maths math = new Maths();
		
		int result = math.multiplication(-2,3);
		Assert.assertEquals(-6, result);
	}
	
	@Test
	public void testWithZero() {		//test for zeros
		Maths math = new Maths();
		
		int result = math.multiplication(0,3);
		Assert.assertEquals(0, result);
	}

}
