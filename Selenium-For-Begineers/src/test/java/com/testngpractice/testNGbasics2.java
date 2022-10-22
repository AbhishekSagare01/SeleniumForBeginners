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

public class testNGbasics2 {

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
		System.out.println("Before Suite Of TestNG Basic 2 -Setup system property");
	}
	
	@BeforeTest
	public void lanchbrowser() {
		System.out.println("Before Test Of TestNG Basic 2- Launch the browser");
	}
	
	
	
	@BeforeClass
	public void login() {
		System.out.println("Before Class Of TestNG Basic 2 - Login");
		
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Before Method Of TestNG Basic 2 - enterURL ");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test case Of TestNG Basic 2-Google title test");
	}
	
	@Test
	public void googleSerachTest() {
		System.out.println("Test case Of TestNG Basic 2-Google Search test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method Of TestNG Basic 2-Logout");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("After Class Of TestNG Basic 2- Close the browser");
	}
	
	@AfterTest
	public void deleteCookie() {
		System.out.println("After Test Of TestNG Basic 2- Delete all cookies");
	}
	
	@AfterSuite
	public void report() {
		System.out.println("After Suite Of TestNG Basic 2- Generate Reports");
	}
	
	
}
