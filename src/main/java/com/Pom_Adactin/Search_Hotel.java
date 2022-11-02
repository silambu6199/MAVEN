package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	
	@FindBy(name = "datepick_in")
	private WebElement checkIn;

	@FindBy(name = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement childsPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement searchBtn;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildsPerRoom() {
		return childsPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public Search_Hotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}		
}
