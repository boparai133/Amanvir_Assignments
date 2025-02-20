package BusyQA.Tests;

import org.testng.annotations.Test;

import BusyQA.Pages.MoneyControl;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class Assignment3Tests {
	
	MoneyControl objMoneyControl;
	WebDriver driver;
	
  @Test
  public void ReadWriteToExcelfile() throws InterruptedException {
	  String excelFilePath = "C:\\Personal\\BusyQA\\SeleniumAssignments\\MaturityValCalc_2024_06_22_20_52_27_699.xlsx";
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      try {
          // Read from Excel file
          FileInputStream inputStream = new FileInputStream(excelFilePath);
          XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
          
          //Go to sheet to read from.
          //Sheet sheet = workbook.getSheetAt(0);
          XSSFSheet sheet = workbook.getSheet("maturityValCalculator");
          
          //Find Number of Rows and Column
          
          //Number of Rows and column
          int rownum = sheet.getLastRowNum();
          int column = sheet.getRow(0).getLastCellNum();     
          
          //Add output values to Hash map collection
          //HashMap<String, String> mapOutputValues = new HashMap<>();
          
          // Iterate over rows column numbers are hard coded
          for(int i = 1; i<= rownum ; i++) {
        	  XSSFRow row = sheet.getRow(i);
        	  objMoneyControl = new MoneyControl(driver);      	  
        	       	 
        		  try {
        			Thread.sleep(Duration.ofSeconds(3));
        		  	objMoneyControl.getButtonNoThanks().click();
        		  }
        		  catch(Exception e)
        		  {        			  
        		  }
        		  
        		  objMoneyControl.clickButtonClear();
        		          		  
        		  objMoneyControl.setPrincipal(new DataFormatter().formatCellValue(row.getCell(0)).toString());        		  
        		  objMoneyControl.setRateOfInterest(new DataFormatter().formatCellValue(row.getCell(1)).toString());
        		  objMoneyControl.setPeriod(new DataFormatter().formatCellValue(row.getCell(2)).toString());
        		  Thread.sleep(Duration.ofSeconds(2));
        		  //objMoneyControl.clickDDLTenurePeriod();
        		  Thread.sleep(Duration.ofSeconds(2));
        		  objMoneyControl.setTenurePeriod(row.getCell(3).toString());
        		  Thread.sleep(Duration.ofSeconds(2));
        		  //objMoneyControl.clickDDLFrequency();
        		  Thread.sleep(Duration.ofSeconds(2));
        		  objMoneyControl.setFrequencyOfInterest(row.getCell(4).toString());
        		  Thread.sleep(Duration.ofSeconds(2));
        		  objMoneyControl.clickButtonCalculate();    
        		  Thread.sleep(Duration.ofSeconds(2));
        		  wait.until(ExpectedConditions.visibilityOf(objMoneyControl.getMaturityValue()));
        		  wait.until(ExpectedConditions.visibilityOf(objMoneyControl.getInterestEarned()));
        		  Thread.sleep(Duration.ofSeconds(2));        		  
        		  
        		  //scroll to view web elements
        		  Actions actions = new Actions(driver);
        		  actions.moveToElement(objMoneyControl.getMaturityValue());
        		  actions.perform();
        		  
        		  String strMaturityVal = objMoneyControl.getMaturityValue().getText();
        		  String strInterestEarned = objMoneyControl.getInterestEarned().getText().replaceFirst("Interest earned Rs.", "");
        		  System.out.println("Row ["+i+"] , col[5] value is: "+strMaturityVal);
        		  System.out.println("Row ["+i+"] , col[6] value is: "+strInterestEarned);
        		  row.createCell(5).setCellValue(strMaturityVal);
        		  row.createCell(6).setCellValue(strInterestEarned);
        		         		          	  
        		  Thread.sleep(Duration.ofSeconds(3));        	  
          }
          
          // Close input stream
          inputStream.close();          
          workbook.write(new FileOutputStream(excelFilePath)); 
          workbook.close();          
        
                   
      } catch (IOException e) {
          e.printStackTrace();
      }
	  
	  
  }
  @BeforeMethod
  public void driverSetup(){
	  System.out.println("This is @BeforeMethod");
	  driver = new ChromeDriver();
	  driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));	  	   
  }

  @AfterMethod
  public void driverClose() {
	System.out.println("Driver closed driverClose()@AfterMethod");	  
	  driver.quit();
  }

}
