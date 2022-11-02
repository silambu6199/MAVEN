package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_GroupingTest {

	@Test(groups = "Whitebox")
	public void aMethod() {

		System.out.println("A");
	}

	@Test(groups = "Blackbox")
	public void bMethod() {

		System.out.println("B");
	}

	@Test(groups = "Whitebox")
	public void cMethod() {

		System.out.println("C");
	}

	@Test(groups = "Blackbox")
	public void dMethod() {

		System.out.println("D");
	}

	@Test(groups = {"Whitebox","Blackbox"})
	public void eMethod() {

		System.out.println("E");
	}

	@Test(groups = {"Whitebox","Blackbox"})
	public void fMethod() {

		System.out.println("F");
	}
}
