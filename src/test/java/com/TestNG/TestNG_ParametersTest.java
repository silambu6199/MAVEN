package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParametersTest {

	@Parameters({"user1"})
	@Test
	public void methodData1(@Optional("rajesh") String username) {

		System.out.println("Username is :" + username);
	}
    
	@Parameters({"pass"})
	@Test
	public void methodData2(String password) {

		System.out.println("Password is :" + password);
	}
}
