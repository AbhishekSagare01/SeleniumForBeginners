package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PositiveTests {

//	method
	public void loginTest() {

		System.out.println("Starting loginTest");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver abc = new ChromeDriver();

	    // Maximize browser
		abc.manage().window().maximize();

		// Sleep for 3 ms
		sleep(3000);

		// open test page
		String url = "http://the-internet.herokuapp.com/login";
		abc.get(url);
		System.out.println("Page is opened");
		// Sleep for 3 ms
		sleep(3000);
		
		// enter user name
		WebElement username = abc.findElement(By.id("username"));
		
		username.sendKeys("tomsmith");
		sleep(1000);
	
		// enter password
		WebElement password = abc.findElement(By.name("password"));
		
		password.sendKeys("SuperSecretPassword!");
		
		sleep(1000);
		
		// click on login

		WebElement logintoPage = abc.findElement(By.tagName("button"));
		logintoPage.click();
		
		
		// verifications:
		/**
		 * new url logout button successful login message
		 */
		
		//Logout button is visible
		WebElement logoutPage = abc.findElement(By.xpath("//a[@class='button secondary radius']"));
		
		
		//Successful login message
		WebElement successMessage = abc.findElement(By.cssSelector("#flash"));
		

		// Close browser
		
		//driver.quit();

	}

	private void sleep(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
