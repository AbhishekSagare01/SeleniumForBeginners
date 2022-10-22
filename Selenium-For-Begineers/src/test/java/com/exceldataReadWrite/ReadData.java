package com.exceldataReadWrite;

import org.testng.annotations.Test;

public class ReadData {
	
	ExcelReader xcel;
	
	
	@Test
	public void excelReadData() {
		xcel = new ExcelReader();
		
		System.out.println(xcel.getStringData("AdminPage", 0, 0));
		
		
		
	}

}
