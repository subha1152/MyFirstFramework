package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	// as wb is going to be used accross the framework, so this is declared as a global variable. 
	//This constructor will help in initialising the excel file
	
	
	//Constructor of ExcelDataProvider class. This will be called as soon the object of ExcelDataProvider class is created.
	public ExcelDataProvider() {
			
	File src=new File("C:\\Users\\subhakpa\\eclipse-workspace\\MyFirstFramework\\TestData\\TestData.xlsx");
	
		try {
			FileInputStream fis=new FileInputStream(src);
		
			wb = new XSSFWorkbook(fis);
	
		} 	catch (IOException e) {
		
			System.out.println("Unable to read the Excel data file"+e.getMessage());
		}
	
	}

	
	public String getStringData(String sheetName, int row, int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
