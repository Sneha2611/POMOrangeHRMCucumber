package com.qa.urtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	private Properties properties;
	
	public Properties init_readConfig()
	{
		File file = new File("C:\\Users\\sneha\\eclipse-workspace1\\POMOrangeHRMCucumber\\src\\test\\resources\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			properties = new Properties();
			properties.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	
	public String getApplocationUrl()
	{
		String appurl = properties.getProperty("url");
		System.out.println(appurl);
		return appurl;
	}
	

	public String getChromeBrowserPath()
	{
		String chromepath = properties.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxBrowserPath()
	{
		String firefoxpath = properties.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
	public String getUname()
	{
		String user = properties.getProperty("uname");
		return user;
	}
	
	
	public String getPwd()
	{
		String pass = properties.getProperty("pwd");
		return pass;
	}
	
	public String getBrowser()
	{
		String browser = properties.getProperty("browser");
		return browser;
	}
	

}
