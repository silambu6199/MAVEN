package com.StepDefinitionCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.BaseCls;
import com.TestRunnerCucumber.MakeMyTrip;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefMakemyTrip extends BaseCls {
	
	WebDriver driver = MakeMyTrip.driver;
	
	
	@Given("^user To Launch The Application$")
	public void user_To_Launch_The_Application() throws Throwable {
		launchUrl("https://www.makemytrip.com/");
	}

	@When("^user To Click The Trains$")
	public void user_To_Click_The_Trains() throws Throwable {

		WebElement train = driver.findElement(By.xpath("(//span[text()='Trains'])[1]"));
		clickOnElement(train);
	}

	@When("^user Click And Select FromCity From The DropDown$")
	public void user_Click_FromCity_From_The_DropDown() throws Throwable {

		driver.findElement(By.id("fromCity")).click();
		singleDropdown(null, null, null);
	}

	@When("^user Click And Select ToCity From The DropDown$")
	public void user_Click_ToCity_From_The_DropDown() throws Throwable {

	}
	
	@When("^user Click And Select The Travel Date From The DropDown$")
	public void user_Click_The_Travel_Date_From_The_DropDown() throws Throwable {

	}

	@When("^user Click And Select The Class From The DropDown$")
	public void user_Click_The_Class_From_The_DropDown() throws Throwable {

	}

	@Then("^user Click The SearchBUtton And It Navigate To NextPage$")
	public void user_Click_The_SearchBUtton_And_It_Navigate_To_NextPage() throws Throwable {

	}

}
