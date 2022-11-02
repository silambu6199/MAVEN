package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCls {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("invalid browser");
			return driver;
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);	
	}
	
	public static void navigate(String navigateType) {
		if (navigateType.equalsIgnoreCase("back")) {
			driver.navigate().back();
			
		}else if (navigateType.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
			
		}else if (navigateType.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void sendValues(WebElement element, String value) {
		// element.sendkeys("values")
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		// element.click();
		element.click();
	}

	public static void closeBrowser() {
		// driver.close();
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void checkDisplayed(WebElement element) {
		// element.isdisplayed();
		element.isDisplayed();
	}

	public static void checkEnabled(WebElement element) {
		element.isEnabled();
	}

	public static void checkSelected(WebElement element) {
		element.isSelected();
	}

	public static void singleDropdown(WebElement element, String methodtype, String value) {
		Select s = new Select(element);
		if (methodtype.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (methodtype.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);

		} else if (methodtype.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}

	public static void multipleDropdown(WebElement element,String methodtype) {
		Select s = new Select(element);
		if (methodtype.equalsIgnoreCase("allselectedoption")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allselected : allSelectedOptions) {
				System.out.println(allselected.getText());
			}
		
		}else if (methodtype.equalsIgnoreCase("firstselected")) {
			WebElement firstSelected = s.getFirstSelectedOption();
			System.out.println(firstSelected.getText());
		
		}else if (methodtype.equalsIgnoreCase("ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println("given options are multiple "+multiple);
		
		}else if (methodtype.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
			
		}else if (methodtype.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = s.getOptions();
			for (WebElement alloptions : options) {
				System.out.println(alloptions.getText());
			}
		}
	}
	
	public static void actions(String type,WebElement element) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		else if (type.equalsIgnoreCase("contextclick")) {
			ac.contextClick(element).build().perform();
		}
		else if (type.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}
		else if (type.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		}
		else if (type.equalsIgnoreCase("draganddrop")) {
			ac.dragAndDrop(element, element);
		}
	}
	 public static void frame(WebElement element) {
			 driver.switchTo().frame(element);	
		}
	 public static void exitFrame(String type) {
		 if (type.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
		 else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}

	 public static void singleWindow() {
		 String windowHandle = driver.getWindowHandle();
		 System.out.println(windowHandle);
	}
		 
	 public static void multipleWindow() {
		 Set<String> windowHandles = driver.getWindowHandles();
		 for (String window : windowHandles) {
			String title = driver.switchTo().window(window).getTitle();
			System.out.println(title);
		} 
      }
	 
	 public static void robots(String key) throws AWTException {
		 Robot r = new Robot();
		 if (key.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		 else if (key.equalsIgnoreCase("up")) {
			 r.keyPress(KeyEvent.VK_UP);
			 r.keyRelease(KeyEvent.VK_UP);
		}
		 else if (key.equalsIgnoreCase("enter")) {
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);		
		}
	}
	
	 public static void simpleAlert() {
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	 }
	 public static void confirmAlert(String type) {
		 Alert alert = driver.switchTo().alert();
		 if (type.equalsIgnoreCase("accept")) {
			alert.accept();
		}else if (type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}
	 public static void promptAlert(String type,String value) {
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys(value);
		 String text = alert.getText();
		 System.out.println(text);

		 if (type.equalsIgnoreCase("accept")) {
			 alert.accept();
		}else if (type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}
	 public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	 
	public static void getTitle() {
		driver.getTitle();	
	}
	
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public static void wait(String waittype,int second,WebElement element) {
		if (waittype.equalsIgnoreCase("implicit")) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
		
		}else if (waittype.equalsIgnoreCase("explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, second);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}
	
	public static void printScreen(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\MR DREAM KILLER 6199\\eclipse-workspace\\MavenProject_class3\\Screenshot\\" + name
						+ ".png");
		FileUtils.copyFile(source, destination);
	}
}