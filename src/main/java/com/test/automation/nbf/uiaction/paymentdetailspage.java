package com.test.automation.nbf.uiaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.nbf.testbase.Testbase;

public class paymentdetailspage extends Testbase {

	WebDriver driver;

	@FindBy(xpath = "(*//span[@id='PageConfigurationMaster_3CBILLW__1:DataEntry_LeftContainer_Stage39.Rb3.C2']//input[@name='autocomplete-dropdown'])[1]")
	WebElement debit_accno_dropdown;

/*	@FindBy(xpath = "(//*[text()='AED - 4096-88XX-XXXX-0042'])[3]")
	WebElement select_accno;*/
	
	@FindBy(xpath="//*[@id=\"outerTab\"]/div[6]/div[5]")
	WebElement select_accno;

	@FindBy(xpath = "//*[@id=\"PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.DESTINATION_NICK\"]")
	WebElement nickname;

	@FindBy(xpath = "//button[@id='PageConfigurationMaster_3CBILLW__1:CONTINUE_TXN_WITH_ADDN_DET']")
	WebElement continue_button1;

	@FindBy(xpath = "//h2[contains(text(),'Payment Details')]")
	WebElement paymentdetails_text;
	
	@FindBy(xpath="//input[@id='PageConfigurationMaster_3CBILLW__1:TranRequestManagerFG.ENTRY_AMT']")
	WebElement amount_tobepaid;
	
	
	@FindBy(xpath="//h1[contains(text(),'Payment Summary')]")
	WebElement paymentsummary_text;
	
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
	public boolean verify_paymentsummarypage() {
		try {
			paymentsummary_text.isDisplayed();
			String ptext = paymentsummary_text.getText();
			System.out.println(ptext);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	

	/*public void selectbydropdown() {
		Select select = new Select(driver.findElement(By.xpath("(//*[text()='AED - 4096-88XX-XXXX-0042'])[3]")));
		select.selectByVisibleText("AED - 4096-88XX-XXXX-0042");

	}*/
	
	
	public void selectbydropdown(WebDriver driver) 
	{
		
			WebElement selectdiv =driver.findElement(By.id("select-options-a8011d37-5b0b-57f9-93e5-8008cdbbe7c2"));
	        Select txtsel=new Select(selectdiv);
	        txtsel.selectByVisibleText("ACCOUNT TITLE OF 6892(AED)  - 012000068924");
		
	        
		Actions action = new Actions(driver);   

		WebElement optionsList = driver.findElement(By.xpath("(//input[@class = 'autocomplete-dropdown initialized'])[1]"));

		action.moveToElement(optionsList);
		
						List<WebElement> options = optionsList.findElements(By.xpath("(//div[contains(@class,'select-wrapper')]//ul[contains(@id,'select-options') and @class='dropdown-content select-dropdown '])[1]"));
				
						for(WebElement option : options) 
						{
				
						    if (option.getText().equals("ACCOUNT TITLE OF 6892(AED)  - 012000068924")) {
				
						       //option.click();
						        
						}
						    
			        WebElement optionsList1 = driver.findElement(By.xpath("(//input[@class = 'autocomplete-dropdown initialized'])[1]"));
			      
			        //optionsList.click();
			        optionsList.sendKeys("ACCOUNT TITLE OF 6892(AED)  - 012000068924");
			        action.sendKeys(Keys.ESCAPE);
			        
		        
			       
		    }
		}
	


	
	

	public void select_accounts() throws InterruptedException {
		
		 

		// scrolldown();
		//debit_accno_dropdown.click();
		///scrolldown();
//		nickname.sendKeys("corp2");
//		Thread.sleep(4000);
//		
//		debit_accno_dropdown.
		
		//debit_accno_dropdown.sendKeys("ACCOUNT TITLE OF 7338(AED) - 012000173388");
		//Thread.sleep(3000);
		
		debit_accno_dropdown.click();
		
		Thread.sleep(4000);
		
		select_accno.click();
		
	//	selectbydropdown(driver);
		//scrolldown();
		Thread.sleep(4000);
		//select_accno.click();
		//debit_accno_dropdown.sendKeys("AED - 4096-88XX-XXXX-0041");
		
		
		nickname.sendKeys("corp2");
		// scrolldown();
		amount_tobepaid.click();
		
		amount_tobepaid.clear();
		
		Thread.sleep(2000);
		
		
		  amount_tobepaid.sendKeys("2000");

	/*	select_accno.click();
		Thread.sleep(4000);*/
//
//		nickname.sendKeys("corp2");
//		Thread.sleep(3000);

		// scrolldown();
		continue_button1.click();
		Thread.sleep(4000);
		
		verify_paymentsummarypage();
		
		
		
		
		
	
		
		
		
	}

}
