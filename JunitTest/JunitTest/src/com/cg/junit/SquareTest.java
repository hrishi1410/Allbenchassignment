package com.cg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
    
	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(10);
		//assertEquals(25, output);
	}
}
