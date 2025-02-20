package BusyQA.Pages;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MoneyControl {
		WebDriver driver;
	
		public MoneyControl(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
				
		//Buttons				
		@FindBy(id = "wzrk-cancel") WebElement btnNoThanks;
		@FindBy(xpath = "//*[@id='fdMatVal']/div[2]/a[1]") WebElement btnCalculate;
		@FindBy(xpath = "//*[@id='fdMatVal']/div[2]/a[2]") WebElement btnClear;
		
		//Text Boxes
		@FindBy(id = "principal") WebElement txtPrincipal;
		@FindBy(id = "interest") WebElement txtInterest;
		@FindBy(id = "tenure") WebElement txtTenure;	
		
		//TenurePeriod Drop down list		
		@FindBy(id = "tenurePeriod") WebElement ddltenurePeriod;
		@FindBy(xpath = "//*[@id='tenurePeriod']/option[1]") WebElement optTenurePeriodDays;
		@FindBy(xpath = "//*[@id='tenurePeriod']/option[2]") WebElement optTenurePeriodMonths;
		@FindBy(xpath = "//*[@id='tenurePeriod']/option[3]") WebElement optTenurePeriodYears;
		
		//Interest Frequency Drop down list		
		@FindBy(id = "frequency") WebElement ddlFrequency;
		@FindBy(xpath = "//*[@id='frequency']/option[1]") WebElement optFrequencySimpleInterest;
		@FindBy(xpath = "//*[@id='frequency']/option[2]") WebElement optFrequencyCompoundMonthly;
		@FindBy(xpath = "//*[@id='frequency']/option[3]") WebElement optFrequencyCompoundQuarterly;
		@FindBy(xpath = "//*[@id='frequency']/option[4]") WebElement optFrequencyCompoundHalfYearly;
		@FindBy(xpath = "//*[@id='frequency']/option[5]") WebElement optFrequencyCompoundYearly;
		
		//Span values		
		@FindBy(xpath = "//*[@id='resp_matval']/strong") WebElement spanMaturityValue;
		@FindBy(xpath = "//*[@id='resp_intval']/em") WebElement spanInterestEarned;
			 
		
			
		//Method to Click No Thanks button of alert on page load
		public void clickButtonNoThanks() {
			btnNoThanks.click();
		}
		
		
		//Method to enter value into Principal(Rs.) Text box
		public void setPrincipal(String amt) {
			txtPrincipal.sendKeys(String.valueOf(amt));
		}
	
		//Method to enter value into Rate of Interest(%) Text box
		public void setRateOfInterest(String roi) {
			//txtInterest.sendKeys(String.valueOf(roi));
			txtInterest.sendKeys(roi);
		}
		
		//Method to enter value into Period Text box
		public void setPeriod(String num) {
			//txtTenure.sendKeys(String.valueOf(num));
			txtTenure.sendKeys(num);
		}
		
		//Select the option period(days/months/years)
		public void setTenurePeriod(String optValue) {
			Select ddl = new Select(ddltenurePeriod);
			switch(optValue) {
			case "day(s)":
				//optTenurePeriodDays.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "month(s)":
				//optTenurePeriodMonths.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "year(s)":
				//optTenurePeriodYears.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
//			default:
//				optTenurePeriodDays.isSelected();
			}
		}
		
		//Select the option frequency(SI/Compound monthly/Compound half yearly/Compound yearly)
		public void setFrequencyOfInterest(String optValue) {
			Select ddl = new Select(ddlFrequency);
			switch(optValue) {
			case "Simple Interest":
				//optFrequencySimpleInterest.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "Compounded Monthly":
				//optFrequencyCompoundMonthly.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "Compounded Quarterly":
				//optFrequencyCompoundQuarterly.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "Compounded Half Yearly":
				//optFrequencyCompoundHalfYearly.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
			case "Compounded Yearly":
				//optFrequencyCompoundYearly.isSelected();
				ddl.selectByVisibleText(optValue);
				break;
//			default:
//				optFrequencySimpleInterest.isSelected();
			}
		}
		
		//Method to click on ddltenurePeriod Drop Down list 
		public void clickDDLTenurePeriod() {
			ddltenurePeriod.click();
		}
		
		//Method to click ddlFrequency
		public void clickDDLFrequency() {
			ddlFrequency.click();
		}
		
		//Method to click on Calculate Button
		public void clickButtonCalculate() {
			btnCalculate.click();
		}
		
		//Method to click on Calculate Button
		public void clickButtonClear() {
			btnClear.click();
		}
		
		//Method to find the Maturity value element
		public WebElement getMaturityValue() {
			return spanMaturityValue;
		}
		
		//Method to find the Maturity value element
		public WebElement getInterestEarned() {
			return spanInterestEarned;
		}
		
		//Method to find the Maturity value element
		public WebElement getButtonNoThanks() {
			
			WebElement element;
			try {
				element= btnNoThanks;
			}
			catch(NoSuchElementException e) {
				element = null;
			}
			return element;			
		}
		

	

}
