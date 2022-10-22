package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.out.println("Before Suite of Google test -Setup system property");}
	
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize(); // Maximize Browser Window
		
		driver.manage().deleteAllCookies(); //to delete cookies from browser
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); // Dynamic Wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Dynamic Wait
	}
	
	
	
	@Test
	public void googleTitleTest() {
		
		String Title= driver.getTitle();
		//System.out.println("Title of the Page is- "+ Title);
	}
	
	@Test
	public void googleLogoTest() {
		
		Boolean logo= driver.findElement(By.id("hplogo")).isDisplayed();
		//System.out.println("Test case-Google Search test");
	}
	
	@Test
	public void gmailLinkTest() {
		
		Boolean Link= driver.findElement(By.linkText("mail")).isDisplayed();
		//System.out.println("Test case-Google Search test");
	}
	
	@AfterMethod
	public void CloseBrowserTest() {
		
		driver.quit();
		
	}

}
