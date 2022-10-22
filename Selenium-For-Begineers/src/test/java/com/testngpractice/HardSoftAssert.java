package com.testngpractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardSoftAssert {
	
	
		

	@Test (priority=1)
	public void googletitleTest() {
		SoftAssert soft=new SoftAssert();
		System.out.println("Test case-Google title test1");
		soft.assertTrue(true);
		//Assert.assertEquals(true, false);
	
		System.out.println("Test case-Google title test2");
		soft.assertTrue(false);
		soft.assertAll();
	}
	
	
	

	}
	

