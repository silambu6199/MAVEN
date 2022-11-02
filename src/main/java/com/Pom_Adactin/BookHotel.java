package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	WebDriver driver;
	
	@FindBy(name = "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement billingAdd;
	
	@FindBy(name = "cc_num")
	private WebElement creditcardNo;
	
	@FindBy(name = "cc_type")
	private WebElement creditcardType;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expMon;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expYear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(name = "book_now")
	private WebElement booknowBtn;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingAdd() {
		return billingAdd;
	}

	public WebElement getCreditcardNo() {
		return creditcardNo;
	}

	public WebElement getCreditcardType() {
		return creditcardType;
	}

	public WebElement getExpMon() {
		return expMon;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBooknowBtn() {
		return booknowBtn;
	}
	

	public BookHotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}