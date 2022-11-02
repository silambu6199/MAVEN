package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_CrossBrowser {

	@Parameters("browsername")
	@BeforeClass
	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("chrome Browser");
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("firefox browser");
		}
	}

	@Test
	public void login() {
 
		System.out.println("Url Launch");
		System.out.println("Login");
	}

	@AfterClass
	public void closeBrowser() {

		System.out.println("Close Browser");
	}
	
}
