package com.ltidemos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	int sum =0;
	
	@BeforeAll
	
	public static void testStartDemo()
	{
		System.out.println("Database is up");
	}
	@BeforeEach
	public void testStartUp() {
		sum=0;
		System.out.println("sum is zero"+sum);
	}

	@Test
	public void testAddTwoNos() {
		System.out.println("Test Case 1");
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}
		
	@Test
		public void testSubTwoNos() {
		System.out.println("Test Case 2");
			int result = c.subNos(300, 200);
			Assertions.assertEquals(100, result);
		
		}
	
	@AfterEach
	
	public void testShutDown()
	{
		System.out.println("some object null");
	}
	
	@AfterAll
	
	public static void testShotDown()
	{
		System.out.println("Shutting down database Connection");
	}

}
