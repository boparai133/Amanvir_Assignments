package BusyQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataTable {

	WebDriver driver;
	//Constructor that will be automatically called as soon as the object of the class is created
	public DataTable(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
		
		//Locator for Table2 field
		By table2 = By.id("table2");
		
		
		
		//Method to enter username
		public WebElement  getTable2() {
			return driver.findElement(table2);
		}
		
		public String  getTitle() {
			return driver.getTitle();
		}

}
