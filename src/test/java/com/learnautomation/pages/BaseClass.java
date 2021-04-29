//Base Class

package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite() {
	
		excel = new ExcelDataProvider(); //to initialize constructor of ExcelDataProvider class
		config = new ConfigDataProvider(); // to initialize constructor of ConfigDataProvider class
		
	}
	

	@BeforeClass
	public void setup(){
		driver = BrowserFactory.launchBrowser(driver, config.getBrowser(), config.getSITUrl());
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);	
	}
	
}
