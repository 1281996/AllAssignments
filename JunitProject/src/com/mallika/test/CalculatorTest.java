package com.mallika.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
CalculatorSample sam=new CalculatorSample(20, 10);
	@Test
	public void test() {
		assertEquals(30,sam.add(),0);
		assertEquals(10,sam.substraction(),0);
		assertEquals(200,sam.multification(),0);
		assertEquals(2,sam.division(),0);
		
	}

}
