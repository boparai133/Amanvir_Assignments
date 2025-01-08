package BusyQA.Module3_Assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BasicSeleniumCode {
	WebDriver driver;
	  @Test
	  public void loginFunction() throws InterruptedException {
		  WebElement userNameElement = driver.findElement(By.name("username"));
		  userNameElement.sendKeys("Admin");
		  
		  WebElement passwordElement = driver.findElement(By.name("password"));
		  passwordElement.sendKeys("admin123");
		  
		  Thread.sleep(2);
		  
		  driver.findElement(By.className("orangehrm-login-button")).click();
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {	   
		   driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(3000);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is Before class method");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is After class method");
	  }
}
