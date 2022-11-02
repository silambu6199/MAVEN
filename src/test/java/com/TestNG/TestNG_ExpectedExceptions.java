package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_ExpectedExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	public void java() {

		int a = 11 / 0;
		System.out.println(a);
		System.out.println("JAVA CLASS");
	}

	@Test
	public void selenium() {

		System.out.println("SELENIUM CLASS");
	}

	@Test
	public void project() {

		System.out.println("PROJECT CLASS");
	}
}
