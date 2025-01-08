package BusyQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {	
WebDriver driver;	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for welcome user field
	By welComeusr = By.cssSelector(".oxd-userdropdown-img");
	
	
	//Locator for Logout link
	By logOutLink = By.linkText("Logout");
	
	//Method to click on Welcom User
	public String Title() {
		return driver.getTitle();
	}
	//Method to click on Welcom User
	public void clickWelcomeUser() {
		driver.findElement(welComeusr).click();
	}
	
	//Method to click on Logout Link
	public void clickLogout() {
		driver.findElement(logOutLink).click();
	}
		
	

}
