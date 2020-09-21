package com.Wellsfargo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Wellsfargo.pages.Login;

public class LoginTest {
	
	@Test
	public void testLoginFunctionality(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\VidyaWorkSpace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		Login login = new Login(driver);
		login.performLogin();		
	}
	
	@Test
	public void testHomepageValidation(){
		System.setProperty("webdriver.chrome.driver", "C:\\VidyaWorkSpace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/");
		Login login = new Login(driver);
		login.validationHomepage();
	}

}
