package com.StepDefinitionPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.BaseCls;
import com.Pom_Adactin.BookHotel;
import com.Pom_Adactin.Booked_Itinerary;
import com.Pom_Adactin.Booking_Confirm;
import com.Pom_Adactin.Login_Page;
import com.Pom_Adactin.Search_Hotel;
import com.Pom_Adactin.Select_Hotel;
import com.TestRunnerPom.AdactinRun;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PomStepDef extends BaseCls {
	
	WebDriver driver = AdactinRun.driver;
	Login_Page log = new Login_Page(driver);
	Search_Hotel search = new Search_Hotel(driver);
	Select_Hotel select = new Select_Hotel(driver);
	BookHotel book = new BookHotel(driver);
	Booking_Confirm confirm = new Booking_Confirm(driver);
	Booked_Itinerary logout = new Booked_Itinerary(driver);
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The  Username In The InputBox$")
	public void user_Enter_The_Username_In_The_InputBox() throws Throwable {
        WebElement username = log.getUsername();
        sendValues(username, "kesavan2309");
	}

	@When("^user Enter The  Password In The InputBox$")
	public void user_Enter_The_Password_In_The_InputBox() throws Throwable {
		WebElement password = log.getPassword();
		sendValues(password, "123456");
	}

	@Then("^user Click On The LoginBtn And It Navigates To The SearchHotel$")
	public void user_Click_On_The_LoginBtn_And_It_Navigates_To_The_SearchHotel() throws Throwable {
		WebElement loginbtn = log.getLoginbtn();
		clickOnElement(loginbtn);
	}

	@When("^user Select The Location From The Dropdown$")
	public void user_Select_The_Location_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The Hotels From The Dropdown$")
	public void user_Select_The_Hotels_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The RoomType From The Dropdown$")
	public void user_Select_The_RoomType_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The NoOfRooms From The Dropdown$")
	public void user_Select_The_NoOfRooms_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The CheckIn Date In The InputBox$")
	public void user_Select_The_CheckIn_Date_In_The_InputBox() throws Throwable {

	}

	@When("^user Select The CheckOut Date In The InputBox$")
	public void user_Select_The_CheckOut_Date_In_The_InputBox() throws Throwable {

	}

	@When("^user Select The AdultsPerRoom From The Dropdown$")
	public void user_Select_The_AdultsPerRoom_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The ChidrenPerRoom From The Dropdown$")
	public void user_Select_The_ChidrenPerRoom_From_The_Dropdown() throws Throwable {

	}

	@Then("^user Click On The SearchBtn And It Navigates To The SelectHotel$")
	public void user_Click_On_The_SearchBtn_And_It_Navigates_To_The_SelectHotel() throws Throwable {

	}

	@When("^user Select The Hotel Click On The RadioBtn$")
	public void user_Select_The_Hotel_Click_On_The_RadioBtn() throws Throwable {

	}

	@Then("^user Click On The ContinueBtn And It Navigates To The Book A Hotel$")
	public void user_Click_On_The_ContinueBtn_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {

	}

	@When("^user Enter The FirstName In The InputBox$")
	public void user_Enter_The_FirstName_In_The_InputBox() throws Throwable {

	}

	@When("^user Enter The LastName In The InputBox$")
	public void user_Enter_The_LastName_In_The_InputBox() throws Throwable {

	}

	@When("^user Enter The BillingAddress In The InputBox$")
	public void user_Enter_The_BillingAddress_In_The_InputBox() throws Throwable {

	}

	@When("^user Enter The CreditCard No In The InputBox$")
	public void user_Enter_The_CreditCard_No_In_The_InputBox() throws Throwable {

	}

	@When("^user Select The CreditCardType From The Dropdown$")
	public void user_Select_The_CreditCardType_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The ExpiryDate In Month From The Dropdown$")
	public void user_Select_The_ExpiryDate_In_Month_From_The_Dropdown() throws Throwable {

	}

	@When("^user Select The ExpiryDate In Year From The Dropdown$")
	public void user_Select_The_ExpiryDate_In_Year_From_The_Dropdown() throws Throwable {

	}

	@When("^user Enter The CVVNumber In The InputBox$")
	public void user_Enter_The_CVVNumber_In_The_InputBox() throws Throwable {

	}

	@When("^user Click On The BookNowBtn$")
	public void user_Click_On_The_BookNowBtn() throws Throwable {

	}

	@Then("^user Wait Five Sec And it Navigates To The Booking Confirmation$")
	public void user_Wait_Five_Sec_And_it_Navigates_To_The_Booking_Confirmation() throws Throwable {

	}

	@When("^user Click On The MyItineraryBtn And It Navigate To The Booked Itinerary$")
	public void user_Click_On_The_MyItineraryBtn_And_It_Navigate_To_The_Booked_Itinerary() throws Throwable {

	}

	@When("^user Click On The LogOutBtn And It Comes To The HomePage$")
	public void user_Click_On_The_LogOutBtn_And_It_Comes_To_The_HomePage() throws Throwable {

	}



}
