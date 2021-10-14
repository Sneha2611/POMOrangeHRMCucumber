package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Driver.DriverFactory;
import com.qa.urtil.ReadConfig;


public class LoginPage extends DriverFactory{

	//WebDriver driver;
	//WebDriverWait wait ;
	

	private WebDriver driver;
	
	
	// 1. By Locators: OR
	
	private By loginpageheader = By.xpath("//div[@id='logInPanelHeading']");
	private By user = By.xpath("//input[@id='txtUsername']");
	private By password = By.id("txtPassword");
	private By loginbtn = By.id("btnLogin");


	// 2. Constructor of the page class:
		public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		// TODO Auto-generated constructor stub
	}

	
		// 3. page actions: features(behavior) of the page the form of methods:
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	public String getLoginpageheader() {
		waitForElementPresent(loginpageheader);
		return driver.findElement(loginpageheader).getText();
	}
	
	public WebElement getUsername() {
		
		return driver.findElement(user);
		
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void enterUsername(String uname)
	{
		waitForElementPresent(user);
		driver.findElement(user).sendKeys(uname);
	}
	
	public HomePage clickonLogin() {
		//waitForElementPresent(loginbtn);
		driver.findElement(loginbtn).click();
		return new HomePage(driver);
	}

}
