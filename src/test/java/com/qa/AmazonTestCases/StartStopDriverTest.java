package com.qa.AmazonTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Resources.Base;

public class StartStopDriverTest extends Base{
	
	static WebDriver  driver;
	@BeforeSuite(alwaysRun=true)
	public  WebDriver startDriver() throws IOException
	{
		driver=initializeDriver();
		return driver;
	}
	@AfterSuite(alwaysRun=true)
	public void closeDriver()
	{
		driver.close();
	}

}
