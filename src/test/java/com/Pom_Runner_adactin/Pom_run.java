package com.Pom_Runner_adactin;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Base_Class.BaseCls;
import com.Pom_Adactin.BookHotel;
import com.Pom_Adactin.Booked_Itinerary;
import com.Pom_Adactin.Booking_Confirm;
import com.Pom_Adactin.Login_Page;
import com.Pom_Adactin.Search_Hotel;
import com.Pom_Adactin.Select_Hotel;

public class Pom_run extends BaseCls {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 driver = browserLaunch("chrome");
		 
		Login_Page login = new Login_Page(driver);
		Search_Hotel search = new Search_Hotel(driver);
		Select_Hotel select = new Select_Hotel(driver);
		BookHotel book = new BookHotel(driver);
		Booking_Confirm confirm = new Booking_Confirm(driver);
		Booked_Itinerary logout = new Booked_Itinerary(driver);
		
		//Url
		launchUrl("https://adactinhotelapp.com/");
	
		//login
		sendValues(login.getUsername(), "silambu2210");
		sendValues(login.getPassword(), "12345678");
		clickOnElement(login.getLoginbtn());
		
		//search
		singleDropdown(search.getLocation(), "index", "3");
		singleDropdown(search.getHotels(), "index", "2");
		singleDropdown(search.getRoomType(), "index", "3");
		singleDropdown(search.getNoOfRooms(), "index", "1");
        sendValues(search.getCheckIn(), "04/09/2022");
        sendValues(search.getCheckOut(), "05/09/2022");
        singleDropdown(search.getAdultsPerRoom(), "index", "2");
        singleDropdown(search.getChildsPerRoom(), "index", "0");
        clickOnElement(search.getSearchBtn());
        
        //select
        clickOnElement(select.getSelectRadiobtn());
        clickOnElement(select.getContinuebtn());
        
        //bookhotel
        sendValues(book.getFirstname(), "Silambarasan");
        sendValues(book.getLastname(), "Muthu");
        sendValues(book.getBillingAdd(), "84 -building,shanthi colony,anna nagar,chennai");
        sendValues(book.getCreditcardNo(), "7896456734567890");
        singleDropdown(book.getCreditcardType(), "index", "1");
        singleDropdown(book.getExpMon(), "visibletext","December");
        singleDropdown(book.getExpYear(), "visibletext", "2022");
        sendValues(book.getCvvNo(), "234");
        clickOnElement(book.getBooknowBtn());
        wait("implicit", 10, null);
        
        //booking confirm
        clickOnElement(confirm.getMyItineraryBtn());
        
        //booked itinerary
        clickOnElement(logout.getLogOutBtn());
        
        printScreen("Adactin");
        
        closeBrowser();
	}
}
