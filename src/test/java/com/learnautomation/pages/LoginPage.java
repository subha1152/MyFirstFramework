package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	//Elements of Login page
	@FindBy(id="username") WebElement userName;
	@FindBy(id="password") WebElement pwd;
	@FindBy(id="Login") WebElement login;
	
	public void loginToApp(String userNameForApplication, String passwordForApplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}

		userName.sendKeys(userNameForApplication);
		pwd.sendKeys(passwordForApplication);
		login.click();
	}

}
