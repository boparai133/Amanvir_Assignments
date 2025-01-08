package BusyQA.Tests;

import org.testng.annotations.Test;

import BusyQA.Pages.Dashboard;
import BusyQA.Pages.LoginPage;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTestCases {
	WebDriver driver;
  
	//Wrong Username and wrong password
	@Test  
  public void TC1()  throws InterruptedException  {
	  System.out.println("This is TC1()");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsername("user");
	  login.enterPassword("admin123");
	  login.clickLogin();	  	 
	  Thread.sleep(3000);
	  System.out.println("\t\t"+login.getText());
	  Assert.assertEquals("Invalid credentials", login.getText());
	  
  }
  
//Correct Username and wrong password
  @Test
  public void TC2()  throws InterruptedException  {
	  System.out.println("\tThis is TC2()");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsername("Admin");
	  login.enterPassword("user123");
	  login.clickLogin();	  	 
	  Thread.sleep(3000);
	  System.out.println("\t\t"+login.getText());
	  Assert.assertEquals("Invalid credentials", login.getText());
	  
  }
  
//Wrong Username and correct password
  @Test
  public void TC3()  throws InterruptedException  {
	  System.out.println("This is TC3()");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsername("user");
	  login.enterPassword("admin123");
	  login.clickLogin();	  	 
	  Thread.sleep(3000);
	  System.out.println("\t\t"+login.getText());
	  Assert.assertEquals("Invalid credentials", login.getText());	  
  }
  
//Correct Username and correct password
  @Test
  public void TC4()  throws InterruptedException  {
	  System.out.println("This is TC4()");
	  LoginPage login = new LoginPage(driver);
	  login.enterUsername("Admin");
	  login.enterPassword("admin123");
	  login.clickLogin();	  	 
	  Thread.sleep(3000);	  
	  Dashboard dashBoard = new Dashboard(driver);
	  Assert.assertEquals("OrangeHRM", dashBoard.Title());
	  dashBoard.clickWelcomeUser();
	  Thread.sleep(2000);
	  dashBoard.clickLogout();
	  //System.out.println("\t\t"+login.getText());
	  //Assert.assertEquals("Invalid credentials", login.getText());
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException  {
	  System.out.println("This is @BeforeMethod");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);	   
  }

  @AfterMethod
  public void afterMethod() {
	  //System.out.println("This is @AfterMethod");	  
	  driver.quit();
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is @BeforeTest");	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @AfterTest");	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is @AfterSuite");
  }

}
