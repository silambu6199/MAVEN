package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	//1.declare the elements as private using @findby annotation
	//2.generate getters
	//3.inside the constructor ,initialize the driver and webelements using 
	//pagefactory.initElements()
	WebDriver driver;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginbtn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}	
	public Login_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
}
