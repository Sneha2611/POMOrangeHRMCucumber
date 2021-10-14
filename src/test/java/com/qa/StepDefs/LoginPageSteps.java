package com.qa.StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.qa.Driver.DriverFactory;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.urtil.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("User is on login page")
	public void user_is_on_login_page()
	{
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		
		DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User gets the header of the login page")
	public void user_gets_the_header_of_the_login_page() {
	   System.out.println("User gets the header of login page");
	   
	}

	@Then("Login page header should be {string}")
	public void login_page_header_should_be(String string) {
	  String lpheader = lp.getLoginpageheader();
	   System.out.println(lpheader);
	   Assert.assertEquals(lpheader, string, "Login page header matched......!!!!!");
	}

	@When("User enters username {string}")
	public void user_enters_username(String un) {
	    lp.enterUsername(un);
	}

	@When("User enters password {string}")
	public void user_enters_password(String pass) {
	    lp.enterPassword(pass);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	     lp.clickonLogin();
	}


}
