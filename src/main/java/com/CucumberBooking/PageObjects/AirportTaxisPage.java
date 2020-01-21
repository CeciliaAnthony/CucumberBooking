package com.CucumberBooking.PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirportTaxisPage {
	WebDriver driver;

	@FindBy(id = "pickupLocation")

	public WebElement txtBoxPickUpLocation;

	@FindBy(id = "dropoffLocation")

	public WebElement txtBoxDropOffLocation;

	@FindBy(id = "returnJourneyNegative")

	public WebElement rbOneWay;

	@FindBy(xpath = "//button[@aria-label='pickup date input field']")

	public WebElement linkCalander;

	@FindBy(className = "rw-date-time-picker")

	public WebElement frameCalander;

	@FindBy(xpath = "//button[@aria-label='pickup time input field']")

	public WebElement linkTime;

	@FindBy(id = "pickupHour")

	public WebElement ddPickUpHour;

	@FindBy(id = "pickupMinute")

	public WebElement ddPickUpMinute;

	@FindBy(className = "rw-time-picker__confirm")

	public WebElement btnConfirm;

	@FindBy(id = "passengers")

	public WebElement ddPassengers;

	@FindBy(name = "searchButton")

	public WebElement btnSearch;

	@FindBy(xpath = "//div[@id='cross-product-bar']/div/a[4]")

	public WebElement linkAirportTaxis;

	@FindBy(className = "gb-c-carousel__items")

	public WebElement elelistOfTaxis;

	public AirportTaxisPage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	public void waitForVisibility(WebElement element, int timeInSeconds) throws Error {
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.visibilityOf(element));
	}

  public int fetchAirportTaxisList() throws Exception{
    	
    	waitForVisibility(elelistOfTaxis,30);
    	List<WebElement> options = elelistOfTaxis.findElements(By.xpath("//div[@class='gb-c-carousel__item']"));
    	System.out.println(options.size());
    	return options.size();
    }
    
	public void datePicker(int fromTodayDate) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, fromTodayDate); // Adding days
		String output = sdf.format(c.getTime());
		System.out.println(output);

		String today = output.substring(0, 2);
		;
		System.out.println("Today's number: " + today + "\n");

		// This are the rows of the from date picker table
		List<WebElement> rows = frameCalander.findElements(By.tagName("tr"));

		// This are the columns of the from date picker table
		List<WebElement> columns = frameCalander.findElements(By.tagName("td"));

		for (WebElement cell : columns) {

			// Select Date
			if (cell.getText().equals(today)) {
				cell.click();
				break;
			}
		}

	}
}
