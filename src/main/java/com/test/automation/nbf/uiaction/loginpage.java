package com.test.automation.nbf.uiaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class loginpage extends Testbase {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='AuthenticationFG.USER_PRINCIPAL']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='AuthenticationFG.ACCESS_CODE']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='VALIDATE_EV_AUTH_CREDENTIALS']")
	WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='AuthenticationFG.ACCESS_CODE']")
	WebElement accesscode;
	
	@FindBy(xpath="//span[contains(text(),'Accept')]")
	WebElement keyboard;
	
	@FindBy(xpath="//button[@id='VALIDATE_CREDENTIALS']")
	WebElement submitlogin;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validlogin() throws InterruptedException {
		username.sendKeys("CORP1.U3");
		Thread.sleep(2000);
		continuebutton.click();
		Thread.sleep(2000);
		accesscode.sendKeys("TEST123");
		Thread.sleep(2000);
		keyboard.click();
		Thread.sleep(2000);
		submitlogin.click();
		
	}
	
	public void validlogin2() throws InterruptedException {
		username.sendKeys("CORP1.U4");
		Thread.sleep(2000);
		continuebutton.click();
		Thread.sleep(2000);
		accesscode.sendKeys("TEST123");
		Thread.sleep(2000);
		keyboard.click();
		Thread.sleep(2000);
		submitlogin.click();
		
	}
	
	
}
