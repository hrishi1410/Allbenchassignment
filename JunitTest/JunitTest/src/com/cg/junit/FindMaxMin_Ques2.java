package com.cg.junit;

public class FindMaxMin_Ques2 {
    
	public static int findMin(int a1[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<min) {
				min=a1[i];
			}
		}
		return min;
	}
	
	public static int findMax(int a1[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i>a1.length;i++) {
			if(a1[i]>max) {
				max=a1[i];
			}
		}
		return max;
	}
}
