package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LogInToPLDTCRM extends BaseClass{
	
	@Test
	public void loginApp() {
		
		//initialisation of "excel" object is done in Base class. As the Base class is extended here so excel object is accessible.
		
		String userName = excel.getStringData("Credentials", 1, 0);
		String password = excel.getStringData("Credentials", 1, 1);
		
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.loginToApp(userName, password);
					
	}

}
