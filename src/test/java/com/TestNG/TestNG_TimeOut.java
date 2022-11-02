package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_TimeOut {

	@Test(timeOut = 3000)
	public void parent() throws InterruptedException {

		Thread.sleep(2000); // by using to understand timeout method
		System.out.println("Parent Class");
	}

	@Test
	public void child() {

		System.out.println("Child Class");
	}
}
