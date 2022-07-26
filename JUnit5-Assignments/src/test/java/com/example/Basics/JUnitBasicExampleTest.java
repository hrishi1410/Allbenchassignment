package com.example.Basics;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JUnitBasicExampleTest {
	
	JUnitBasicExample jb;
	TestInfo info;
	TestReporter tr;
	
	@Nested
	class AddTest
	{
		@Test
		@DisplayName("Testing add Method for +")
		void positive()
		{
			assertEquals(4,jb.add(2, 2),"This is + number");
		}
		@Test
		@DisplayName("Testing add Method for -")
		void negative()
		{
			int expected=-2;
			int actual=jb.add(-1, -1);
			assertEquals(expected,actual, ()-> "This should be sum"+expected+ "And the actual value is "+actual);
		}
	}
	
	
	@BeforeAll
	@Tag("Math")
	static void BeforeAllInit()
	{
		System.out.println("This needs to Before all");
	}
	
	@BeforeEach
	@Tag("Math")
	void init(TestInfo info,TestReporter tr)
	{
		this.info=info;
		this.tr=tr;
		jb=new JUnitBasicExample();
		tr.publishEntry("Running"+info.getDisplayName()+"with Tags"+info.getTags());
	}
	@AfterAll
	@Tag("Math")
	static void disp()
	{
		System.out.println("This is Display Method");
	}
	@AfterEach
	@Tag("Math")
	void cleanup()
	{
		System.out.println("Cleaning up........");
	}

	@Test
	@DisplayName("Testong add Method")
	@Tag("Math")
	void testAdd() {
		
		int expected=2;
		int actual =jb.add(1, 1);
		assertEquals(expected, actual,"The Method are should be two Numbers");
	}
	
	
	
	@Test
	@Tag("Math")
	void testdiv()
	{
		boolean isservice=false;
		assumeTrue(isservice);
		assertThrows(ArithmeticException.class, ()-> jb.div(1, 0),"Divide by Zero");
	}
	@Test
	@RepeatedTest(3)
	@Tag("Circle")
	void testcomputeCircleRadius()
	{
		
		
		assertEquals(314.1592653589793238, jb.computeCircleArea(10),"This Should be right Area Radius");
	}
	
	@Test
	@Disabled
	@DisplayName("TDD Method should not be run")
	@Tag("Math")
	void testDisabled()
	{
		fail("This test should be disabled");
	}
	
	@Test
	@DisplayName("Multiply Method")
	@Tag("Math")
	void mul()
	{
		System.out.println("Running"+info.getDisplayName()+"with Tags"+info.getTags());
		tr.publishEntry("Running"+info.getDisplayName()+"with Tags"+info.getTags());
		assertAll(
				() -> assertEquals(12, jb.mul(4, 3),"Should be a right product"),
				() -> assertEquals(5, jb.add(4, 1),"Should be a right product"),
				() -> assertEquals(2, jb.sub(6, 4),"Should be a right product")
				);
	}
	
}
