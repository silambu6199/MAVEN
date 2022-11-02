package com.TestRunnerCucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featureCucumber\\Adactin.feature", glue = "com.StepDefinitionCucumber", plugin = {
		"pretty", "html:Report/Cucumber_Report", "json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html" }, monochrome = true, // strict =true,
		dryRun = false// tags = "@test1"
		)

public class AdactinRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}
}

//"html:Report/Cucumber_Report" ,"json:Report/Cucumber.json",
//"com.cucumber.Listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html"},

//@runwith(Cucumber.class)-->using only before the class and inside the package
//@cucumberoptions()   --- >also using before the class and inside the package

//@beforeclass and @afterclass --->using inside the class 