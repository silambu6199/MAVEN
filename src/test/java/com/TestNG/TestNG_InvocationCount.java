package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {

	@Test
	public void aMethod() {

		System.out.println("A");
	}

	@Test(invocationCount = 5)
	public void bMethod() {

		System.out.println("B");
	}

	@Test
	public void cMethod() {

		System.out.println("C");
	}
}
