package com.ltidemos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@ParameterizedTest
	@ValueSource(ints = {8, 10, 30,14,20})
	public void testIntAryParam(int arg) {
		System.out.println("arg :"+ arg);
		Assertions.assertTrue(arg %2 ==0);
		
	}
	
	@DisplayName("should pass test cases if all parameters are not null")
	@ParameterizedTest
	@ValueSource(strings = {"Hello" , "World"})
	public void testSParams(String message)
	{
		
		Assertions.assertNotNull(message);
	}
		
	
	
	
	public void testLambdaList() {
		Integer[] intAry = {10,20,5,25};
		List<Integer> intList =  Arrays.asList(intAry);
		
		Assertions.assertAll(
				()->assertEquals(10,intList.get(0)),
		        ()->assertEquals(20,intList.get(1)),
		        ()->assertEquals(15,intList.get(2)),
		        ()->assertEquals(25,intList.get(3))
		        );
		
	}
	
	@RepeatedTest(value=3,name= "Repeat 3 times")
	public void repeatTest()
	{
		int a= 10,b=20;
		Assertions.assertEquals(200,(a*b));
	}
	

}