package com.Wellsfargo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="userid")
	public WebElement txtUsername;
	
	@FindBy(id ="password")
	public WebElement txtPassword;    
	
	@FindBy(id = "btnSignon")
	public WebElement btnSubmit;
	
	@FindBy(xpath = "\\h2[contains(text()='Simplified banking')]")              
	public WebElement h2Header;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
                                                                                  
	public void performLogin(){
		
		txtUsername.sendKeys("kirrunice@gmail.com");
		txtPassword.sendKeys("kiran1kumar");
		btnSubmit.click();
	}
	
	public void validationHomepage(){
		h2Header.getText();
		
	}

}
                                                                                                           