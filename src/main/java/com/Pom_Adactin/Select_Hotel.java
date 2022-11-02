package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	private WebElement selectRadiobtn;

	@FindBy(name = "continue")
	private WebElement continuebtn;

	public WebElement getSelectRadiobtn() {
		return selectRadiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public Select_Hotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
