package com.qa.StepDefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.qa.Driver.DriverFactory;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.LoginPage;
import com.qa.urtil.ReadConfig;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private ReadConfig readconfig = new ReadConfig();
	private HomePage homepage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credentialsTable) {
			List<Map<String, String>> credList =	credentialsTable.asMaps();
			String uname = credList.get(0).get("username");
			String pass = credList.get(0).get("password");
			
			DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
			
			DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			lp.enterUsername(uname);
			lp.enterPassword(pass);
			homepage = lp.clickonLogin();
			
			
	}

	@Then("User gets home page header and homepage header should be {string}")
	public void user_gets_home_page_header_and_homepage_header_should_be(String header) {
		
		String hpheader = homepage.getHomepageheader();
		Assert.assertEquals(hpheader, header);
	   
	}

	@Then("User gets main menu list")
	public void user_gets_main_menu_list(DataTable menutable) {
		
		List<String> expectedmenulist =  menutable.asList();
		
		List<String> actualmenulist = homepage.getmainmenuList();
		
		Assert.assertTrue(expectedmenulist.containsAll(actualmenulist));
	    
	}

	
}
