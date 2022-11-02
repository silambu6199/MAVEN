package com.TestRunnerPom;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.BaseCls;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurePom", glue = "com.StepDefinitionPom")

public class AdactinRun extends BaseCls {
	public static WebDriver driver;

	@BeforeClass
	public static void launch() {

	driver = browserLaunch("chrome");

	}

	@AfterClass
	public static void close() {

		closeBrowser();

	}

}
