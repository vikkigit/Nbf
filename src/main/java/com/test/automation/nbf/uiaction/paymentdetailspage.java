package com.test.automation.nbf.uiaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.nbf.testbase.Testbase;

public class paymentdetailspage extends Testbase {

	WebDriver driver;

	@FindBy(xpath = "(*//span[@id='PageConfigurationMaster_3CBILLW__1:DataEntry_LeftContainer_Stage39.Rb3.C2']//input[@name='autocomplete-dropdown'])[1]")
	WebElement debit_accno_dropdown;

	@FindBy(xpath = "(//*[text()='AED - 4096-88XX-XXXX-0042'])[3]")
	WebElement select_accno;

	@FindBy(xpath = "//*[@id=\"PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.DESTINATION_NICK\"]")
	WebElement nickname;

	@FindBy(xpath = "//button[@id='PageConfigurationMaster_3CBILLW__1:CONTINUE_TXN_WITH_ADDN_DET']")
	WebElement continue_button1;

	@FindBy(xpath = "//h2[contains(text(),'Payment Details')]")
	WebElement paymentdetails_text;

	public paymentdetailspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verify_paymentdetailspage() {
		try {
			paymentdetails_text.isDisplayed();
			String ptext = paymentdetails_text.getText();
			System.out.println(ptext);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectbydropdown() {
		Select select = new Select(driver.findElement(By.xpath("(//*[text()='AED - 4096-88XX-XXXX-0042'])[3]")));
		select.selectByVisibleText("AED - 4096-88XX-XXXX-0042");

	}

	public void select_accounts() throws InterruptedException {
		// scrolldown();
		// nickname.sendKeys("corp2");

		// scrolldown();
		//debit_accno_dropdown.click();
		///scrolldown();
//		nickname.sendKeys("corp2");
//		Thread.sleep(4000);
//		
//		debit_accno_dropdown.sendKeys("AED - 4096-88XX-XXXX-0042");
//		Thread.sleep(3000);

	/*	select_accno.click();
		Thread.sleep(4000);*/
//
//		nickname.sendKeys("corp2");
//		Thread.sleep(3000);

		// scrolldown();
		continue_button1.click();
		Thread.sleep(4000);
	}

}
