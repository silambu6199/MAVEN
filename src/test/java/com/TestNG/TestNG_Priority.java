package com.TestNG;

import org.testng.annotations.Test;
public class TestNG_Priority {

	@Test(priority = 1)   //4th
	public void blackBox() {

		System.out.println("Black Box Testing");
	}
	
	@Test(priority = -2)  //1st
	public void sanity() {

		System.out.println("Sanity Testing");
	}

	@Test(priority = 0)   //3rd
	public void smoke() {

		System.out.println("Smoke Testing");
	}

	@Test(priority = -1)   //2nd
	public void whiteBox() {

		System.out.println("White Box Testing");
	}
}
