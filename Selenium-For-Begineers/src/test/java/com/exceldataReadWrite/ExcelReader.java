package com.exceldataReadWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	

	
	XSSFWorkbook wb;
	
	public  ExcelReader() {
		
		File src= new File ("C:\\Users\\Abhishek\\eclipse-workspace\\Selenium-For-Begi"
				+ "neers\\src\\test\\java\\com\\exceldataReadWrite\\AdminData.xlsx");
		
		
		try {
			FileInputStream fis= new FileInputStream(src);
		 wb = new XSSFWorkbook(fis);
		}catch(Exception e) {
			
			System.out.println("Unable to read file");
			}

	}
	
	//Example of Method Overloading: below two methods
	public String getStringData(int sheetIndex,int row,int column) {
		
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
			
		}
	
		
	public String getStringData(String sheetName,int row,int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
			
		}
	
	
	public double getStringNumericValue(String sheetName,int row,int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
		
		
	}


