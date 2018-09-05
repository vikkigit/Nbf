package com.test.automation.nbf.login;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.nbf.testbase.Testbase;
import com.test.automation.nbf.uiaction.billapprovalqueue;
import com.test.automation.nbf.uiaction.billpaymentpage;
import com.test.automation.nbf.uiaction.dashboard;
import com.test.automation.nbf.uiaction.loginpage;

public class TC002_approvebillpayments  extends Testbase{

	loginpage login;
	dashboard dashboard;
	billpaymentpage billapayment;
	billapprovalqueue billapprove;
	
	
	@BeforeClass
	public void start() throws IOException, InterruptedException {
		init();
	}

	@Test
	public void approvebill() throws InterruptedException {
		login=new loginpage(driver);
		dashboard=new dashboard(driver);
		billapayment=new billpaymentpage(driver);
		billapprove=new billapprovalqueue(driver);
		
		
		login.validlogin2();
		Thread.sleep(4000);
		
		dashboard.navigate_to_billpayments();
		Thread.sleep(4000);
		
		billapprove.approve_transaction();
		
		
		Thread.sleep(5000);
		
		billapprove.final_approve();
		
		dashboard.logout();

	}

}

