package com.StepDefinitionCucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestRunnerCucumber.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDef {
	WebDriver driver = AdactinRunner.driver;
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}
//	@When("^user Enter The \"([^\"]*)\" Username In The InputBox$")
//	public void user_Enter_The_Username_In_The_InputBox(String user) throws Throwable {
//		driver.findElement(By.className("login_input")).sendKeys(user);
//	}
//	
//	@When("^user Enter The \"([^\"]*)\" Password In The InputBox$")
//	public void user_Enter_The_Password_In_The_InputBox(String pass) throws Throwable {
//		 driver.findElement(By.id("password")).sendKeys(pass); 
//	}
	
	@When("^user Enter The  Username In The InputBox$")
	public void user_Enter_The_Username_In_The_InputBox() throws Throwable {
		driver.findElement(By.className("login_input")).sendKeys("silambu2210");
	}

	@When("^user Enter The  Password In The InputBox$")
	public void user_Enter_The_Password_In_The_InputBox() throws Throwable {
		 driver.findElement(By.id("password")).sendKeys("12345678");   
	}
	
	@Then("^user Click On The LoginBtn And It Navigates To The SearchHotel$")
	public void user_Click_On_The_LoginBtn_And_It_Navigates_To_The_SearchHotel() throws Throwable {
		driver.findElement(By.className("login_button")).click();
	}

	@When("^user Select The Location From The Dropdown$")
	public void user_Select_The_Location_From_The_Dropdown() throws Throwable {
		WebElement d1 = driver.findElement(By.id("location"));
		Select s1 = new Select(d1);
		s1.selectByIndex(2); 
	}

	@When("^user Select The Hotels From The Dropdown$")
	public void user_Select_The_Hotels_From_The_Dropdown() throws Throwable {
		 WebElement d2 = driver.findElement(By.id("hotels"));
		 Select s2 = new Select(d2);
		 s2.selectByValue("Hotel Creek");
	}

	@When("^user Select The RoomType From The Dropdown$")
	public void user_Select_The_RoomType_From_The_Dropdown() throws Throwable {
		 WebElement d3 = driver.findElement(By.id("room_type"));
		 Select s3 = new Select(d3);
		 s3.selectByVisibleText("Deluxe");
	}

	@When("^user Select The NoOfRooms From The Dropdown$")
	public void user_Select_The_NoOfRooms_From_The_Dropdown() throws Throwable {
		 WebElement d4 = driver.findElement(By.id("room_nos"));
		 Select s4 = new Select(d4);
		 s4.selectByValue("3");
	}

	@When("^user Select The CheckIn Date In The InputBox$")
	public void user_Select_The_CheckIn_Date_In_The_InputBox() throws Throwable {
	     driver.findElement(By.id("datepick_in")).sendKeys("11/10/2022");	 
	}

	@When("^user Select The CheckOut Date In The InputBox$")
	public void user_Select_The_CheckOut_Date_In_The_InputBox() throws Throwable {
	    driver.findElement(By.id("datepick_out")).sendKeys("13/10/2022");
	}

	@When("^user Select The AdultsPerRoom From The Dropdown$")
	public void user_Select_The_AdultsPerRoom_From_The_Dropdown() throws Throwable {
		WebElement d5 = driver.findElement(By.id("adult_room"));
	    Select s5 = new Select(d5);
	    s5.selectByValue("3");
	}

	@When("^user Select The ChidrenPerRoom From The Dropdown$")
	public void user_Select_The_ChidrenPerRoom_From_The_Dropdown() throws Throwable {
		 WebElement d6 = driver.findElement(By.id("child_room"));
		 Select s6 = new Select(d6);
		 s6.selectByValue("1");
	}

	@Then("^user Click On The SearchBtn And It Navigates To The SelectHotel$")
	public void user_Click_On_The_SearchBtn_And_It_Navigates_To_The_SelectHotel() throws Throwable {
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@When("^user Select The Hotel Click On The RadioBtn$")
	public void user_Select_The_Hotel_Click_On_The_RadioBtn() throws Throwable {
		 driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user Click On The ContinueBtn And It Navigates To The Book A Hotel$")
	public void user_Click_On_The_ContinueBtn_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		 driver.findElement(By.id("continue")).click();
	}

	@When("^user Enter The FirstName In The InputBox$")
	public void user_Enter_The_FirstName_In_The_InputBox() throws Throwable {
		 driver.findElement(By.id("first_name")).sendKeys("SILAMBARASAN"); 
	}

	@When("^user Enter The LastName In The InputBox$")
	public void user_Enter_The_LastName_In_The_InputBox() throws Throwable {
		driver.findElement(By.xpath("//input[@name ='last_name']")).sendKeys("MUTHU");
	}

	@When("^user Enter The BillingAddress In The InputBox$")
	public void user_Enter_The_BillingAddress_In_The_InputBox() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("1/114 Mariyamman Kovil st,Laligam,Dharmapuri-636804");
	}

	@When("^user Enter The CreditCard No In The InputBox$")
	public void user_Enter_The_CreditCard_No_In_The_InputBox() throws Throwable {
	    driver.findElement(By.xpath("//input[@name ='cc_num']")).sendKeys("8734567834561234"); 
	}

	@When("^user Select The CreditCardType From The Dropdown$")
	public void user_Select_The_CreditCardType_From_The_Dropdown() throws Throwable {
		WebElement d7 = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(d7);
		s7.selectByIndex(2);
	}

	@When("^user Select The ExpiryDate In Month From The Dropdown$")
	public void user_Select_The_ExpiryDate_In_Month_From_The_Dropdown() throws Throwable {
		WebElement d8 = driver.findElement(By.id("cc_exp_month"));
	    Select s8 = new Select(d8);
	    s8.selectByVisibleText("December");
	}

	@When("^user Select The ExpiryDate In Year From The Dropdown$")
	public void user_Select_The_ExpiryDate_In_Year_From_The_Dropdown() throws Throwable {
		WebElement d9 = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(d9);
		s9.selectByValue("2022");
	}

	@When("^user Enter The CVVNumber In The InputBox$")
	public void user_Enter_The_CVVNumber_In_The_InputBox() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("462");
	}

	@When("^user Click On The BookNowBtn$")
	public void user_Click_On_The_BookNowBtn() throws Throwable {
	   driver.findElement(By.id("book_now")).click();
	}

	@Then("^user Wait Five Sec And it Navigates To The Booking Confirmation$")
	public void user_Wait_Five_Sec_And_it_Navigates_To_The_Booking_Confirmation() throws Throwable {
       Thread.sleep(5000);
	}

	@When("^user Click On The MyItineraryBtn And It Navigate To The Booked Itinerary$")
	public void user_Click_On_The_MyItineraryBtn_And_It_Navigate_To_The_Booked_Itinerary() throws Throwable {
	     driver.findElement(By.id("my_itinerary")).click();
	}

	@When("^user Click On The LogOutBtn And It Comes To The HomePage$")
	public void user_Click_On_The_LogOutBtn_And_It_Comes_To_The_HomePage() throws Throwable {
	     driver.findElement(By.id("logout")).click();
	}
}
