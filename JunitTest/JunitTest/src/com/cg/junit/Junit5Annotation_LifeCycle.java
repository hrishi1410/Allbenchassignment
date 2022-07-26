package com.cg.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Junit5Annotation_LifeCycle {
     
	Calculator_Ques4 cal;
	
	@BeforeEach
	public void initialize() {
		System.out.println("Operation start......");
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("Operation ends.....");
	}
	
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("Execution start.......");
		System.out.println("------------");
	}
	
	@AfterAll
	public static void afterAllTest() {
		System.out.println("Execution ends successfully");
	}
	
	@Order(1)
	@Test
	//@RepeatedTest(3)
	@DisplayName("Adding two small positive numbers")
	public void addTest1() {
		int sum=cal.add(10, 20);
		System.out.println("Sum of two numbers is: "+sum);
	}
	
	@Order(3)
	@Test
	@DisplayName("Adding two small negative numbers")
	public void addTest2() {
		int sum=cal.add(-10, -50);
		System.out.println("Sum of two small -ve numbers is: "+sum);
	}
	
	    //@Disabled
		@Order(2)
		@Test
		@DisplayName("Adding two big positive number ")
		public void addTest3()
		{
			
			int sum=cal.add(105,24);
			System.out.println("Sum of Two big +ve number is "+sum);
		}
		
		@Order(4)
		@Test
		@DisplayName("Adding two big Negative number ")
		public void addtest4()
		{
			
			int sum=cal.add(-105,-204);
			System.out.println("Sum of Two big -ve number is "+sum);
		}

		
}
