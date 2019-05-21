package com.emids.app.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTestCases {

	private ArtihameticOperations artihameticOperations;

	/** * Initialization before executing the actual test case */
	@Before
	public void objectInitialization() {

		artihameticOperations = new ArtihameticOperations();
		System.out.println("object Created");

	}

	@Test
	public void testAdditionWithHappyFlow() {

		int i = artihameticOperations.addition(3, 7);
		assertEquals(10, i);
	}
	
	@Test
	public void testAdditionWithNegitiveValues() {

		int i = artihameticOperations.addition(-10, -7);
		assertEquals(-17, i);
	}

	/** * destroy the object */
	@After
	public void tearDown() {
		artihameticOperations = null;
		System.out.println("object destroyed");
	}
	
	
	
}
