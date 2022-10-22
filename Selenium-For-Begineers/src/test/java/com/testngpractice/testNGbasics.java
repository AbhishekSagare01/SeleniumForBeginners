package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGbasics {

	/*Sequence of annotations TestNG
	 * 	Before Suite -Setup system property
		Before Test- Launch the browser
		Before Class - Login
		Before Method - enterURL 
		Test case-Google Search test
		After Method-Logout
		Before Method - enterURL 
		Test case-Google title test
		After Method-Logout
		After Class- Close the browser
		After Test- Delete all cookies
		PASSED: googleSerachTest
		PASSED: googleTitleTest
	 * 
	 */
	
	@BeforeSuite
	public void setup() {
		System.out.println("Before Suite -Setup system property");
	}
	
	@BeforeTest
	public void lanchbrowser() {
		System.out.println("Before Test- Launch the browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Before Class - Login");
		
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Before Method - enterURL ");
	}
	
	@Test (timeOut=1)
	public void googletitleTest() {
		System.out.println("Test case-Google title test");
	}
	
	@Test(description=" Test case 1")
	public void googleserachTest() {
		System.out.println("Test case-Google Search test");
	}
	
	@Test (timeOut=1)
	public void googleiTest() {
		System.out.println("Test case-Google i title test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method-Logout");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("After Class- Close the browser");
	}
	
	@AfterTest
	public void deleteCookie() {
		System.out.println("After Test- Delete all cookies");
	}
	
	@AfterSuite
	public void report() {
		System.out.println("After Suite- Generate Reports");
	}
	
	
}
