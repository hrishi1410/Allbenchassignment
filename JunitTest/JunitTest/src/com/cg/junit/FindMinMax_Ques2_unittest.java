package com.cg.junit;

import org.junit.jupiter.api.Test;

public class FindMinMax_Ques2_unittest {
     
	int[] array=new int[] {56,34,7,3,54,3,34,34,53};
	
	@Test
	public void testMin() {
		int minValue=FindMaxMin_Ques2.findMin(array);
		assert(minValue==3);
		System.out.println("True");
	}
	
	@Test
	public void testMax() {
		int maxValue=FindMaxMin_Ques2.findMax(array);
		assert(maxValue==56);
		System.out.println("True");
	}
	
	
	
}
