package com.qa.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Driver.DriverFactory;




public class HomePage extends DriverFactory {
	//WebDriver driver;

	private WebDriver driver;
	
	private By homepageheader = By.xpath("//h1");
	private By welcome_link = By.xpath("//a[@id='welcome']");
	private By logout = By.xpath("//div[@id='welcome-menu']/ul/li[3]/a");
	private By recruitement = By.xpath("//div[@id='mainMenu']/ul/li[5]/a");
	 
	private By mainmenulist = By.xpath("//div[@id='mainMenu']/ul/li");

	
	public HomePage(WebDriver driver) {

		// TODO Auto-generated constructor stub
		//driver = driver;
		this.driver=driver;
	}
	
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public String getHomepageheader() {
		return driver.findElement(homepageheader).getText();
	}

	
	public List<String> getmainmenuList()
	{
		
		List<String> menulistnames = new ArrayList<String>();
		List<WebElement> menulist = driver.findElements(mainmenulist);
		for(WebElement e : menulist)
		{
			String text = e.getText();
			System.out.println(text);
			menulistnames.add(text);
			
		}
		return menulistnames;
	}
	
	public LoginPage clickLogout()
	{
		driver.findElement(welcome_link).click();
		driver.findElement(logout).click();
		
		return new LoginPage(driver);
	}
	
	
	
}
