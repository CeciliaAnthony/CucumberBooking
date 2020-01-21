package com.CucumberBooking.PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarRentalsPage {
	WebDriver driver;

	WebDriverWait wait;

	@FindBy(name = "ss_origin")

	public WebElement txtBoxPickUpFrom;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")

	public WebElement linkCalander;

	@FindBy(className = "c2-calendar-viewport")

	public WebElement frameCalander;

	@FindBy(id = "return-location-same")

	public WebElement rbReturnToSameLocation;

	@FindBy(name = "checkinTime")

	public WebElement ddCheckInTime;

	@FindBy(name = "checkinTimeMinutes")

	public WebElement ddCheckInTimeMinutes;

	@FindBy(name = "checkoutTime")

	public WebElement ddCheckOutTime;

	@FindBy(name = "checkoutTimeMinutes")

	public WebElement ddCheckOutTimeMinutes;

	@FindBy(id = "S4KM-cabin-b-label")

	public WebElement linkClass;

	@FindBy(xpath = "//button[@id='c1CZ6']/span")

	public WebElement btnIncreaseAdults;

	@FindBy(className = "search_hl_name")

	public WebElement selectValue;

	@FindBy(xpath = "//div[@class='xp__button xp-button__no_age']/div[2]/button")

	public WebElement btnSearch;

	@FindBy(xpath = "//div[@id='cross-product-bar']/div/a[2]")

	public WebElement linkCarRentals;

	@FindBy(xpath = "//div[@class='section']/div/div[2]")

	public WebElement elelistOfCars;

	public CarRentalsPage(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	public void waitForVisibility(WebElement element, int timeInSeconds) throws Error {
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.visibilityOf(element));
	}

	public int fetchCarList(String review) throws Exception {

		waitForVisibility(elelistOfCars, 30);
		List<WebElement> options = elelistOfCars.findElements(By.xpath("//div[@class='bui-review-score__title']"));
		int count = 0;
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().trim().equalsIgnoreCase(review)) {
				count++;
			}
		}
		System.out.println(options.size());
		System.out.println(count);
		return count;
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
