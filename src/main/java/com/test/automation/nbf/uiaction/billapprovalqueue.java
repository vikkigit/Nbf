package com.test.automation.nbf.uiaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class billapprovalqueue extends Testbase{
	
	WebDriver driver;
	
	public billapprovalqueue(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@id='PageConfigurationMaster_3CBILLW__1:APPRQUE']")
	WebElement approvalqueue_menu;
	
	@FindBy(xpath="//*[@id=\"HWListTable10072682\"]/tbody[1]/tr[1]/td[1]/label")
	WebElement select_referenceid;
	
	
	@FindBy(xpath="(//span[@id='PageConfigurationMaster_3CBILLW__1:DownloadPanel_Stage315.Ra1.C2']//input[@name='autocomplete-dropdown'])[1]")
	WebElement multirecord_action;
	
	
	@FindBy(xpath="//*[@id=\"outerTab\"]/div[6]/div[2]")
	WebElement select_approve;
	
	@FindBy(xpath="//button[@id='PageConfigurationMaster_3CBILLW__1:GO' and contains(text(),'Continue')]")
	//@FindBy(xpath="//*[@id=\\\"PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.TRANSACTION_PASSWORD__\\\"]")
	WebElement continue_approve;
	////*[@id="PageConfigurationMaster_3CBILLW__1:GO"]
	
	@FindBy(xpath="//*[@id=\"PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.TRANSACTION_PASSWORD__\"]")
	WebElement trans_password;
	
	@FindBy(xpath="//*[@id=\"PageConfigurationMaster_3CBILLW__1:APPROVE_TRANSACTION\"]")
	WebElement  submit_approve;
	
	public void approve_transaction() throws InterruptedException {
		
		approvalqueue_menu.click();
		Thread.sleep(2000);
		select_referenceid.click();
		multirecord_action.click();
		Thread.sleep(3000);
		select_approve.click();
		Thread.sleep(2000);
		continue_approve.click();
		Thread.sleep(5000);
	}
	
	
	public void final_approve() throws InterruptedException {
		trans_password.sendKeys("TEST123");
		Thread.sleep(3000);
		submit_approve.click();
	}
	
	
	
	
}
