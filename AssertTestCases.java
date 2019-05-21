package com.emids.app.junit;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertTestCases {

	@Test
	public void testToArraysEquality() {

		char[] expected = { 'E', 'm', 'i', 'd', 's' };
		char[] actual = "Emids".toCharArray();

		assertArrayEquals(expected, actual, "char arrays are equal");

	}

	@Test
	void testToAssertEqual() {
		assertEquals("Emids", "Emids");
		assertEquals(20, 20, "Both Integers are equal");
		assertNotEquals(2 + 2 + 7, 4);
		
	}

	@Test
	void testAssertFalse() {
		assertFalse("FirstName".length() == 10);
		assertFalse(10 > 20, "assertion message");
	}

	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = new String();
		assertNull(str1);
		assertNotNull(str2);

	}

	@Test
	void testAssertSame() {
		Object unexpected = new Object();
		Object actual = new Object();

		assertNotSame(unexpected, actual);

	}
	
	@Test
	public void testAssertAll() {
		assertAll("heading", 
				() -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
				() -> assertNotEquals("java", "JAVASCRIPT".toLowerCase())
				);
	}

	

	

}
