package com.Base_Class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_child1 extends BaseCls {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException{

		driver = browserLaunch("chrome");
		launchUrl("https://www.facebook.com/login/");

		WebElement mail = driver.findElement(By.name("email"));
		sendValues(mail, "silambu123@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));
		sendValues(pass, "12345678");

		WebElement loginbtn = driver.findElement(By.name("login"));
		clickOnElement(loginbtn);

		// singleDropdown(loginbtn, "value", "3");

		//printScreen("basechild");
		wait("implicit", 20, null);
		closeBrowser();
		System.out.println("success");
	}
}
