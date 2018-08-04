package com.capgemini.junit.test;

import com.capgemini.junit.calculator.*;
import org.junit.Assert;
import org.junit.Test;
//class for testing the subtraction method
/*Assert.assertEquals(args 1, args 2) -> it takes 2 arguments, 
args 1 -> actual answer
args 2 -> answer came from defined method*/ 

public class TestSubtraction {

	@Test
	public void testBothPositive() { 		//test for both positives
		Maths math = new Maths();
		int answer = math.subtract(2, 3);
		Assert.assertEquals(-1, answer);
	}
	
	@Test
	public void testBothNegative() {		//test for both negatives
		Maths math = new Maths();
		int answer = math.subtract(-2, -3);
		Assert.assertEquals(1, answer);
	}
	
	@Test
	public void testOnePositiveOneNegative() {		//test for first -ive, second +ive
		Maths math = new Maths();
		int answer = math.subtract(-2, 3);
		Assert.assertEquals(-5, answer);
	}
	
	@Test
	public void testFirstPositiveSecondNegative() {		//test for first +ive, second -ive
		Maths math = new Maths();
		int answer = math.subtract(2, -3);
		Assert.assertEquals(5, answer);
	}
	
	@Test
	public void testBothZero() {		//test for two zeros
		Maths math = new Maths();
		int answer = math.subtract(0, 0);
		Assert.assertEquals(0, answer);
	}
	

}

