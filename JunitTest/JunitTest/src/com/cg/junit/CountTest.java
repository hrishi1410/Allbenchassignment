package com.cg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountTest {
   
	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.count("javabean");
		assertEquals(2, output);
	}
}
