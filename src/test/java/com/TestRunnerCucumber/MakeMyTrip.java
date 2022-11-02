package com.TestRunnerCucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.BaseCls;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featureCucumber\\Makemytrip.feature",glue = "com.StepDefinitionCucumber")

public class MakeMyTrip extends BaseCls {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {

		driver=browserLaunch("chrome");
	}

	@AfterClass
	public static void close() {

		closeBrowser();
	}
}
