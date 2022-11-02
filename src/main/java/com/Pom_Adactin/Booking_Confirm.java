package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {

	WebDriver driver;
	
	@FindBy(name = "my_itinerary")
	private WebElement myItineraryBtn;

	public WebElement getMyItineraryBtn() {
		return myItineraryBtn;
	}
	
	public Booking_Confirm(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
