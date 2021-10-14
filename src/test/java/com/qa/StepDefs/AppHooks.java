package com.qa.StepDefs;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.Driver.DriverFactory;
import com.qa.urtil.ReadConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ReadConfig readconfig;
	Properties prop;
	
	@Before
	public void launchBrowser()
	{
		readconfig  = new ReadConfig();
		prop = readconfig.init_readConfig();
		String browser = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver=driverfactory.init_driver(browser);
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}

}
