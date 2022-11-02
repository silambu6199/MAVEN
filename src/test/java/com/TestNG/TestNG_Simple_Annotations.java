package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG_Simple_Annotations {

	@BeforeSuite	
	public void setUp() {
		System.out.println("system Set Property");
	}

    @BeforeTest
	public void browserLaunch() {
		System.out.println("chrome browser");
	}
    
    @BeforeClass
	public void launchUrl() {
		System.out.println("Launch Amazon Application");
	}

    @BeforeMethod
    public void login() {
    	System.out.println("Login");
	}
    
    @Test
	public void searchLaptop() {
		System.out.println("Search Hp Laptop");
	}

    @Test
	public void searchMobile() {
		System.out.println("Search Samsung M51");
	}

    @AfterMethod
	public void Verify() {
		System.out.println("Verification");
	}
    @AfterClass
    public void logout() {
    	System.out.println("Logout");
	}
    
    @AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

    @AfterSuite
	public void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
