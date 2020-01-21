package com.CucumberBooking.stepDefinitions;

import com.CucumberBooking.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
	
	TestBase testBase;
	@Before
	public void intializeBeforeEveryTest()
	{
		testBase = new TestBase();
		testBase.driverInitialization();
	}
	
	
	@After
	public void endTest()
	{
		testBase = new TestBase();
		testBase.driver.quit();
	}
}
