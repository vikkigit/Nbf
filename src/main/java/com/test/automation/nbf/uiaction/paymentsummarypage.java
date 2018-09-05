package com.test.automation.nbf.uiaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class paymentsummarypage extends Testbase {

	
	
	WebDriver driver;

	@FindBy(xpath="(//*[@id='PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG._NEXT_APPROVER_'])[2]")
	WebElement select_approver;
	
	@FindBy(xpath="//input[@id='PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.TRANSACTION_PASSWORD__']")
	WebElement trans_pwd;
	

	
	@FindBy(xpath="(//span[contains(text(),'Accept')])[1]")
	WebElement accept;

	@FindBy(xpath="//button[@id='PageConfigurationMaster_3CBILLW__1:SUBMIT_TRANSACTION']")
	WebElement submit;
	
	
	
	
	
	
	
	public paymentsummarypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void submitpayment() throws InterruptedException {
		
		
		select_approver.sendKeys("U4");
		
	//	Thread.sleep(3000);
		
		trans_pwd.sendKeys("TEST123");
		
		Thread.sleep(3000);
		
		accept.click();
		
		Thread.sleep(2000);
		
		submit.click();
		
		Thread.sleep(4000);
		
	
	}
}
