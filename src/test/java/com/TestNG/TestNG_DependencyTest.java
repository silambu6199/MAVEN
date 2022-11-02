package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_DependencyTest {

	@Test()
	public void getUrl() {

		System.out.println("Get Url");
	}

	@Test(dependsOnMethods = "getUrl")
	public void login() {

		// int a = 7/0 ;                // this method comes exception and
		System.out.println("Login");    // the next all method will be automatically stopped because using depends on
	}

	@Test(dependsOnMethods = "login")
	public void logOut() {

		System.out.println("Logout");
	}
}
