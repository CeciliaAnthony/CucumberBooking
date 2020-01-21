package com.CucumberBooking.stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.CucumberBooking.PageObjects.AirportTaxisPage;
import com.CucumberBooking.PageObjects.CarRentalsPage;
import com.CucumberBooking.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarRentalsStepDefinitions extends TestBase{
	
	CarRentalsPage objCarRentals = new CarRentalsPage(driver);
	
	@Given("^I am on Main of Booking URL \"([^\"]*)\"$")
	public void i_am_on_main_of_Booking_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}
	
	@Then("^I should see Car Rentals$")
	public void i_should_see_Car_Rentals() throws Throwable{
		objCarRentals.waitForVisibility(objCarRentals.linkCarRentals, 30);
		Assert.assertTrue(objCarRentals.linkCarRentals.isDisplayed());
	}


	@When("^I click on car rentals link$")
	public void i_click_on_car_rentals_link() throws Throwable{
		objCarRentals.linkCarRentals.click();
		
	}
	
    @And("^I click on return to same location radio button$")
	public void i_click_on_return_to_same_location_radio_button() throws Throwable{
    	objCarRentals.waitForVisibility(objCarRentals.txtBoxPickUpFrom, 15);
		if (!(objCarRentals.rbReturnToSameLocation.isSelected())) {
			objCarRentals.rbReturnToSameLocation.click();
		}
		Thread.sleep(3000);
		
	}
    
    @And("^I enter pick up from as \"([^\"]*)\"$")
	public void i_enter_pick_up_from_as(String arg1) throws Throwable{
    	objCarRentals.txtBoxPickUpFrom.clear();
    	objCarRentals.txtBoxPickUpFrom.sendKeys(arg1);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
    	
	}
    
    @And("^I select date from as \"([^\"]*)\"$")
   	public void i_select_date_from_as(String arg1) throws Throwable{
    	objCarRentals.waitForVisibility(objCarRentals.linkCalander, 3);
    	objCarRentals.linkCalander.click();
    	objCarRentals.datePicker(Integer.parseInt(arg1));
    	
   	}
   
    @And("^I select check in time as \"([^\"]*)\"$")
   	public void i_select_check_in_time_as(String arg1) throws Throwable{
    	Thread.sleep(2000);
		if (!(objCarRentals.ddCheckInTime.isDisplayed())) {
			objCarRentals.linkCalander.click();
		}
		Select eleCheckinTime = new Select(objCarRentals.ddCheckInTime);
		eleCheckinTime.selectByVisibleText(arg1);
    }
    
    @And("^I select check in time minutes as \"([^\"]*)\"$")
   	public void i_select_check_in_time_minutes_as(String arg1) throws Throwable{
    	Select eleCheckinTimeMin = new Select(objCarRentals.ddCheckInTimeMinutes);
		eleCheckinTimeMin.selectByVisibleText(arg1);
    }
    
    @And("^I select check out time as \"([^\"]*)\"$")
   	public void i_select_check_out_time_as(String arg1) throws Throwable{
    	Select eleCheckoutTime = new Select(objCarRentals.ddCheckOutTime);
		eleCheckoutTime.selectByVisibleText(arg1);
    }
    
    @And("^I select check out time minutes as \"([^\"]*)\"$")
   	public void i_select_check_out_time_minutes_as(String arg1) throws Throwable{
    	Select eleCheckoutTimeMin = new Select(objCarRentals.ddCheckOutTimeMinutes);
		eleCheckoutTimeMin.selectByVisibleText(arg1);

    }
    
    @And("^I select date To as \"([^\"]*)\"$")
   	public void i_select_date_To_as(String arg1) throws Throwable{
    	Thread.sleep(2000);
		if (!(objCarRentals.ddCheckInTime.isDisplayed())) {
			objCarRentals.linkCalander.click();
		}
		objCarRentals.datePicker(Integer.parseInt(arg1));

    	
   	}

    @And("^I click on search in car rentals page$")
	public void i_click_on_search_in_car_rentals_page() throws Throwable{
    	objCarRentals.btnSearch.click();
		
	}
    
    @Then("^I should see List of car rentals available for given locations with rating as \"([^\"]*)\"$")
   	public void I_should_see_List_of_car_rentals_available_for_given_locations_with_rating_as(String arg1) throws Throwable{
    	int countOfExcellentCars = objCarRentals.fetchCarList(arg1);
		Assert.assertTrue(countOfExcellentCars>0, arg1+" car rating availability");
		
}
}
