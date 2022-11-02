package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@Test(dataProvider = "data1")
	public void methodData(String username, String password) {

		System.out.println("Username is : " + username + "Password is :" + password);
	}

	@DataProvider(name = "data1")
	public Object[][] testData() {

		return new Object[][]

		{

				{ "abc", "123" }, { "def", "456" }

		};

	}

}