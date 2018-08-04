package com.capgemini.junit.test;

import static org.junit.Assert.*;
import com.capgemini.junit.calculator.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

//test class for addition for maths class
/*Assert.assertEquals(args 1, args 2) -> it takes 2 arguments, 
args 1 -> actual answer
args 2 -> answer came from defined method*/ 

public class TestAddition {

	@Test
	public void testPositiveAddition() { 	//test condition when inputs are 2 positives
		Maths math = new Maths();
		
		int answer = math.add(2, 3);
		Assert.assertEquals(5, answer);

	}
	
	@Test
	public void testNegativeAddition() {		//test condition when inputs are 2 negatives
		Maths math = new Maths();
		
		int answer = math.add(-2, -3);
		Assert.assertEquals(-5, answer);

	}
	
	@Test
	public void testPositiveAndNegativeAddition() {		//test condition when first input is negative & second is positives
		Maths math = new Maths();
		
		int answer = math.add(-2, 3);
		Assert.assertEquals(1, answer);

	}
	
	@Test
	public void testZeroAddition() {		//test for two zeros 
		Maths math = new Maths();
		
		int answer = math.add(0, 0);
		Assert.assertEquals(0, answer);

	}

}
