package BusyQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
	By uName = By.name("username");
	
	
	//Locator for password field
	By pswd = By.name("password");
	
	//Locator for login button
	By loginBtn = By.cssSelector(".oxd-button");
	
	//Locator for error message
	By loginError = By.cssSelector(".oxd-alert-content-text");
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	//Method to get error text
		public String getText() {
			return driver.findElement(loginError).getText();
		}

}
