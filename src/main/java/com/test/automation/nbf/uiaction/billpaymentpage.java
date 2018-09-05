package com.test.automation.nbf.uiaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class billpaymentpage extends Testbase {

	WebDriver driver;
	
	@FindBy(xpath="//table[@id='ListOfBillerRetrieved']/tbody[4]/tr[1]/td[6]")
	WebElement selectdeva;
	
	@FindBy(xpath="//a[@id='PageConfigurationMaster_3CBILLW__1:FWD_PAY_BILLS[3]1']")
	WebElement pay;
	
	@FindBy(xpath="//h1[contains(text(),'Bill Payment')]")
	WebElement billpayment_text;
	
	
	public billpaymentpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verify_billpayment_text() {
		try {
		 billpayment_text.isDisplayed();
		 String btext=billpayment_text.getText();
		 System.out.println(btext);
		 return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public void selectbill() throws InterruptedException {
		Thread.sleep(4000);
		verify_billpayment_text();
		
		selectdeva.click();
		Thread.sleep(4000);
		
		pay.click();
		Thread.sleep(10000);
	
	}
}
