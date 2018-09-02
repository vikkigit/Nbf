package com.test.automation.nbf.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class Testbase {
	public static final Logger log = Logger.getLogger(Testbase.class.getName());
	
	public  WebDriver driver;
	public Properties prop = new Properties();

	public void init() throws IOException, InterruptedException {
		loadpropdata();
		selectbrowser(prop.getProperty("browser"));
		driver.manage().window().maximize();
		geturl(prop.getProperty("url"));
		// log 4j properties
		String log4j = "log4j.properties";
		PropertyConfigurator.configure(log4j);

	}

	public void loadpropdata() throws IOException {

		File file = new File(
				System.getProperty("user.dir") + "/src/main/java/com/test/automation/nbf/properties/config.properties");
		FileInputStream f = new FileInputStream(file);
		prop.load(f);

	}

	private void selectbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	private void geturl(String url) {
		driver.get(url);
	}
	
	@AfterClass(alwaysRun = true)
	public void endtest() {
		closebrowser();
	}

	
	public void closebrowser() {
		driver.quit();
		log.info("browser closed");
	}
	
	
	public void scrolldown() {
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,250)", "");
	}
	
	public void scrollup() {
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("scroll(0, -250);");
	}
	


}
