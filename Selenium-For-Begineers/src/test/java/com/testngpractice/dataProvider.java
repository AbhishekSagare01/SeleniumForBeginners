package com.testngpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	 
	
	//@Test (dataProvider="geata")  //if you are providing name then make sure u provide same name @DataProvider(name="ABC")
	    // Number of columns should match the number of input parameters
	
	@Test(dataProvider="getData")  // This method takes data as input parameters. The attribute dataprovider is mapped to "getData"
	public void loginTest(String Uid, String Pwd){
		
	System.out.println("UserName is "+ Uid);
	System.out.println("Password is "+ Pwd);
	
	}
	/*If the name is not supplied, the data provider’s name automatically defaults to the method’s name.
	@DataProvider(name="ABC") //Here name is optional . if you are providing name then make sure u provide same name @Test(dataprovider="")*/
	
	
	@DataProvider
	public Object[][] getData(){   
	Object [][] data = new Object [2][2];        /*  A data provider returns an array of objects.
                                                Object [][] data = new Object [rowCount][colCount];   */
	data [0][0] = "FirstUid";
	data [0][1] = "FirstPWD";
	data[1][0] = "SecondUid";
	data[1][1] = "SecondPWD";
	return data;
	}
	}

