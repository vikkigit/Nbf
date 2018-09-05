package com.test.automation.nbf.login;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import com.test.automation.nbf.testbase.Testbase;
import com.test.automation.nbf.uiaction.billpaymentpage;
import com.test.automation.nbf.uiaction.dashboard;
import com.test.automation.nbf.uiaction.loginpage;
import com.test.automation.nbf.uiaction.paymentdetailspage;
import com.test.automation.nbf.uiaction.paymentsummarypage;

public class TC001_valid_login extends Testbase {
	
	loginpage login;
	dashboard dashboard;
	billpaymentpage billapayment;
	paymentdetailspage payment;
	paymentsummarypage paymentsummary;
	
	@BeforeClass
	public void start() throws IOException, InterruptedException {
		init();
	}
	
	@Test
	public void verifylogin() throws InterruptedException {
		login=new loginpage(driver);
		dashboard=new dashboard(driver);
		billapayment=new billpaymentpage(driver);
		payment=new paymentdetailspage(driver);
		paymentsummary=new paymentsummarypage(driver);
		
		login.validlogin();
		Thread.sleep(4000);
		
		dashboard.verifydashboard_page();
		Thread.sleep(4000);
		
		dashboard.navigate_to_billpayments();
		Thread.sleep(4000);
		
		billapayment.verify_billpayment_text();
		Thread.sleep(4000);
		
		billapayment.selectbill();
		Thread.sleep(4000);
		
		payment.verify_paymentdetailspage();
		Thread.sleep(4000);
		
		payment.select_accounts();
		Thread.sleep(3000);
		
		paymentsummary.submitpayment();
		
		Thread.sleep(3000);
		dashboard.logout();
		
	}
	

}
