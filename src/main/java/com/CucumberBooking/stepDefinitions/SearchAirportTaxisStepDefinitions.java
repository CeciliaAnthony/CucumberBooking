package com.CucumberBooking.stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.CucumberBooking.PageObjects.AirportTaxisPage;
import com.CucumberBooking.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAirportTaxisStepDefinitions extends TestBase{
	
	AirportTaxisPage objAirportPage = new AirportTaxisPage(driver);
	
	@Given("^I am on Default of Booking URL \"([^\"]*)\"$")
	public void i_am_on_Default_of_Booking_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}
	
	@Then("^I should see Airport Taxis$")
	public void i_should_see_Airport_Taxis() throws Throwable{
		objAirportPage.waitForVisibility(objAirportPage.linkAirportTaxis, 30);
		Assert.assertTrue(objAirportPage.linkAirportTaxis.isDisplayed());
	}


	@When("^I click on airport taxis link$")
	public void i_click_on_airport_taxis_link() throws Throwable{
		objAirportPage.linkAirportTaxis.click();
		
	}
  
    @And("^I click on oneway radio button$")
	public void i_click_on_oneway_radio_button() throws Throwable{
    	objAirportPage.waitForVisibility(objAirportPage.txtBoxPickUpLocation,20);
		if (!(objAirportPage.rbOneWay.isSelected())) {
			objAirportPage.rbOneWay.click();
		}
		Thread.sleep(2000);
		
	}
    
    @And("^I enter pickUpLocation as \"([^\"]*)\"$")
	public void i_enter_pickUpLocation_as(String arg1) throws Throwable{
    	objAirportPage.txtBoxPickUpLocation.clear();
    	objAirportPage.txtBoxPickUpLocation.sendKeys(arg1);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
    	
	}
    
    @And("^I enter dropOffLocation as \"([^\"]*)\"$")
	public void i_enter_dropOffLocation_as(String arg1) throws Throwable{
    	Thread.sleep(3000);
    	objAirportPage.txtBoxDropOffLocation.clear();
    	objAirportPage.txtBoxDropOffLocation.sendKeys(arg1);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
    	
	}
   
    @And("^I select date as \"([^\"]*)\"$")
   	public void i_select_date_as(String arg1) throws Throwable{
    	objAirportPage.waitForVisibility(objAirportPage.linkCalander, 3);
    	objAirportPage.linkCalander.click();
    	objAirportPage.datePicker(Integer.parseInt(arg1));
    	
   	}
    
    @And("^I select pickUp hour as \"([^\"]*)\"$")
   	public void i_select_pickUp_hour_as(String arg1) throws Throwable{
    	objAirportPage.waitForVisibility(objAirportPage.linkTime, 3);
    	objAirportPage.linkTime.click();

		if (!(objAirportPage.ddPickUpHour.isDisplayed())) {
			objAirportPage.linkTime.click();
		}
		Select elePickUpHour = new Select(objAirportPage.ddPickUpHour);
		elePickUpHour.selectByVisibleText(arg1);
    }
    
    @And("^I select pickUp minute as \"([^\"]*)\"$")
   	public void i_select_pickUp_minute_as(String arg1) throws Throwable{
    	Select elePickUpMinute = new Select(objAirportPage.ddPickUpMinute);
		elePickUpMinute.selectByVisibleText(arg1);
		objAirportPage.btnConfirm.click();
    	
   	}
    
    
    @And("^I select passengers as \"([^\"]*)\"$")
   	public void i_select_passengers_as(String arg1) throws Throwable{
    	Select elePassengers = new Select(objAirportPage.ddPassengers);
		elePassengers.selectByVisibleText(arg1);
    	
   	}
    
    @And("^I click on Search in Airport Taxis Page$")
	public void i_click_on_Search_in_Airport_Taxis_Page() throws Throwable{
    	objAirportPage.btnSearch.click();
		
	}
    
    @Then("^I should see List of airport taxis available for given locations$")
   	public void I_should_see_List_of_airport_taxis_available_for_given_locations() throws Throwable{
    	int countOfAirportTaxis = objAirportPage.fetchAirportTaxisList();
    	System.out.println(countOfAirportTaxis);
		Assert.assertTrue(countOfAirportTaxis>0, "Excellent car rating availability");
		
}
}
