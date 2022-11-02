package com.facebookrunner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLaunch {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Screenshot\\facebooklunc.png");
        FileUtils.copyFile(source, dest);
        
        System.out.println("COMPLETED");
	}
}
