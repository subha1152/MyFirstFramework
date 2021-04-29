package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

// To Read data from config.properties file.

public class ConfigDataProvider {
	
	Properties pro; // As this is going to be used in and outside the class, so defined it as a global variable
	
	public ConfigDataProvider() {
		
		File src = new File("C:\\Users\\subhakpa\\eclipse-workspace\\MyFirstFramework\\Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Unable to read config filr >>> "+e.getMessage());			
		} 
		
		
	}
	
	
	public String getDataFromConfig() {
		
		return pro.getProperty("Name");
		
	}
	
	public String getBrowser() {
		
		return pro.getProperty("Browser"); //Browser is the key value that we get from config.properties file
	}
	
	public String getSITUrl() {
		
		return pro.getProperty("SITUrl");
		
		
	}
}
