package BusyQA.Tests;

import org.testng.annotations.Test;

import BusyQA.Pages.DataTable;
import BusyQA.Pages.Frank;
import BusyQA.Pages.LoginPage;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataTableTestClass {
	WebDriver driver;
  @Test(enabled = false)
  public void Test1() throws InterruptedException {
	  
	  System.out.println("This is Test1()");
	  DataTable dTable = new DataTable(driver);
	  WebElement dt = dTable.getTable2();
	  // Find all rows in the table
      List<WebElement> rows = dt.findElements(By.tagName("tr"));

      // Print the number of rows in the table
      System.out.println("Number of rows in the table: " + rows.size());
	  Thread.sleep(3000);
	  
		// Iterate through all the rows in table and print data.
	  	for (int i = 1; i < rows.size(); i++) {
	          WebElement row = rows.get(i);
	          // Find all columns in the row
	          List<WebElement> columns = row.findElements(By.tagName("td"));
	          System.out.print("No. of columns are: "+columns.size() + "\t");
	          // Iterate through columns and print data
	          for (WebElement column : columns) {
	              System.out.print(column.getText() + "\t");
	          }
	      System.out.println(); // Move to the next row
	  	}	  
  }
  
  @Test(dependsOnMethods = "Test1()", enabled = false)
 public void Test2() throws InterruptedException {
	  
	  System.out.println("This is Test2()");
	  DataTable dTable = new DataTable(driver);
	  WebElement dt = dTable.getTable2();
	  // Find all rows in the table
      List<WebElement> rows = dt.findElements(By.tagName("tr"));

      // Print the number of rows in the table
      System.out.println("Number of rows in the table: " + rows.size());
	  Thread.sleep(3000);
	  
	  //validate First 4 Columns:
	  String[][] testData = {
			  					//{"Last Name", "First Name", "Email", "Due"},
			  					{"Smith", "John", "jsmith@gmail.com", "$50.00"},
			  					{"Bach", "Frank", "fbach@yahoo.com", "$51.00"},
			  					{"Doe", "Jason", "jdoe@hotmail.com", "$100.00"},
			  					{"Conway", "Tim", "tconway@earthlink.net", "$50.00"},
	  						};
		// After finding rows in the table
	  	for (int i = 1; i < rows.size(); i++) {
	          WebElement row = rows.get(i);
	          // Find all columns in the row
	          List<WebElement> columns = row.findElements(By.tagName("td"));
	          System.out.print("No. of columns are: "+columns.size() + "\t");
	          // Iterate through columns and print data
		          for(int j=1;j < (columns.size()-2);j++)
		          {
		        	  WebElement column = columns.get(j);
			          String tableLName = column.getText();
			          System.out.println("Column value from array is: "+ testData[i-1][j] + " Column value from table is: "+tableLName);			          
			          Assert.assertEquals(testData[i-1][j],tableLName);  
		          }                   
	          	
	         }
	      System.out.println(); // Move to the next row	
  }
  
  @Test(enabled = true)
 public void Test3() throws InterruptedException {
	  
	  System.out.println("This is Test3()");
	  DataTable dTable = new DataTable(driver);
	  WebElement dt = dTable.getTable2();
	  
	  // Find all rows in the table
      List<WebElement> rows = dt.findElements(By.tagName("tr"));     
      
      //Print the number of rows in the table
      System.out.println("Number of rows in the table: " + rows.size());
	  Thread.sleep(3000);
	  
	  
	  //After finding rows in the table
	  	for (int i = 1; i < rows.size(); i++) {
	          WebElement row = rows.get(i);
	          // Find all columns in the row
	          List<WebElement> columns = row.findElements(By.tagName("td"));
	         // System.out.print("No. of columns are: "+columns.size() + "\t");
	         
	          // Iterate through all the rows and print column 4 values		          
        	  WebElement column = columns.get(4);
	          String strWebsite = column.getText();
	          System.out.println("Expected: " + Frank.testWebUrl +" Actual: "+ strWebsite);
	          if(Frank.testWebUrl.equals(strWebsite))
	          {
	        	  System.out.println("Expected Column value is:" + Frank.testWebUrl.toString() + " Column value from table is: "+strWebsite);
	        	  driver.get("http://www.frank.com");
	        	  Frank frnk = new Frank(driver);	        	  
	        	  System.out.println("Expected Title: " + Frank.titleFrank +" Actual Title: "+ frnk.Title());
	        	  Assert.assertEquals(Frank.titleFrank, frnk.Title());
	        	  break;
	          }	     	     
	  	}	  
  }
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.out.println("This is @beforeClass");
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);	   
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is @afterClass");
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is @beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @afterTest");
	  
  }

}
