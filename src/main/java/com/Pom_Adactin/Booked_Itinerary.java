package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {

	WebDriver driver;
	
	@FindBy(name = "logout")
	private WebElement logOutBtn;
	
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public Booked_Itinerary(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
