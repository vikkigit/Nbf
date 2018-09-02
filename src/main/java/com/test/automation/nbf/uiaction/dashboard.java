package com.test.automation.nbf.uiaction;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.nbf.testbase.Testbase;

public class dashboard extends Testbase {
	WebDriver driver;

	@FindBy(xpath="//a[@id='HREF_Logout']")
	WebElement logoutlink;
	
	@FindBy(xpath="(//a[@id=\"ID_CTXNS\"])[1]")
	WebElement payments_link;
	
	@FindBy(xpath="(//li[@id='IL_CTXNS_60' and ./a[1] ])[2]")
	WebElement billpayments_link;
	
	@FindBy(xpath="(//i[contains(text(),'keyboard_arrow_right')])[4]")
	WebElement header2_rightarrow;
	
	
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifydashboard_page() {
		try {
			logoutlink.isDisplayed();
			String logouttext=logoutlink.getText();
			System.out.println(logouttext);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void navigate_to_billpayments() throws InterruptedException {
		payments_link.click();
		Thread.sleep(2000);
		
		header2_rightarrow.click();
		
		Thread.sleep(4000);
		billpayments_link.click();
		Thread.sleep(2000);
	}
	
	
	
	public void logout() {
		logoutlink.click();
	}
	
	
	
	
	
}
