package BusyQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frank {
	
	WebDriver driver;
	public static String testWebUrl = "http://www.frank.com";
	public static String titleFrank = "Bitcoin is Hope";
	//Constructor that will be automatically called as soon as the object of the class is created

	public Frank(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}			
	
	//This method returns the page title	
	public String  Title() {
		return driver.getTitle();
	}

}
