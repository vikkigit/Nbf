package com.test.automation.nbf.uiaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class tradefinance extends Testbase {
	
	WebDriver driver;
	
	public tradefinance(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@id=\"ID_CTFN\"])[1]")
	WebElement tradefinance;
	
	
	@FindBy(xpath="(//a[@id='ID_CSRQX3' and @name='HREF_Service_Requests'])[1]")
	WebElement service_request;
	
	@FindBy(xpath="(//*[@id=\"New-Requests_New-Requests\"])[1]")
	WebElement newrequest;
	
	
	
	public void navigatetonewRq() throws InterruptedException {
		service_request.click();
		Thread.sleep(2000);
		newrequest.click();
	}
	
	
	
}
