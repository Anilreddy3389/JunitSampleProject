package com.emids.app.junit;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AssumtionTestCases {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, -1 })
	void testToassumeTrue(int i) {
		assumeTrue(i > 0);
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Test
	void testToassumeFalse() {
		assumeFalse("Emids".equals("EmidsTech"), AssumtionTestCases.message());

	}

	@Test
	void testToAssumingThat() {
		assumingThat("Emids".equals("Emids"), () -> {
			System.out.println(executeMethod());
		});
	}

	private String executeMethod() {
		return "condition true --> so executed the executeMethod";

	}

	public static String message() {
		return "TEST Execution Failed :: ";
	}

}
