package com.TestNG;

import org.testng.annotations.Test;

public class TestNg_ParallelTest {

	@Test()
	public void blackBox() throws InterruptedException {

		Thread.sleep(2000);         // by using only for understanding parallel concepts
		System.out.println("Black Box Testing");
	}

	@Test()
	public void whiteBox() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("White Box Testing");
	}

}