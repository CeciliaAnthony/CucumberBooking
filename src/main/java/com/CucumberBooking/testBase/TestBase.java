package com.CucumberBooking.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public static WebDriver driver;
	
	public WebDriver driverInitialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");

		// Instantiate the web driver and load the page
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("disable-extensions");
		options.addArguments("start-maximized");

		driver = new ChromeDriver(options);
		
		return driver;
	}
}
