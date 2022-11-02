package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Ignore {

    @Ignore	   // we are using ignore method
	@Test
	public void blackBox() {
		
		System.out.println("Black Box Testing");
	}
	
	@Test(enabled = false) // by using enabled
	public void sanity() {
		
		System.out.println("Sanity Testing");
	}
	
	@Test
	public void smoke() {
		
		System.out.println("Smoke Testing");
	}

	@Test
	public void whiteBox() {
		
		System.out.println("White Box Testing");
	}
}
