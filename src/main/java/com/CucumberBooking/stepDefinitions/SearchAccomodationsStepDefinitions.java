package com.CucumberBooking.stepDefinitions;

import org.testng.Assert;

import com.CucumberBooking.PageObjects.AccomodationPage;
import com.CucumberBooking.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAccomodationsStepDefinitions extends TestBase {
	
	AccomodationPage objAccomodationPage = new AccomodationPage(driver);
	
	@Given("^I am on HomePage of Booking URL \"([^\"]*)\"$")
	public void i_am_on_HomePage_of_Booking_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}
	
	@Then("^I should see Home Page$")
	public void i_should_see_HomePage() throws Throwable{
		objAccomodationPage.waitForVisibility(objAccomodationPage.linkAccomodation, 30);
		Assert.assertTrue(objAccomodationPage.linkAccomodation.isDisplayed());
	}
	
	@When("^I click on Accomodations link$")
	public void i_click_on_Accomodations_link() throws Throwable{
		objAccomodationPage.linkAccomodation.click();
		
	}
  
    @And("^I enter Place as \"([^\"]*)\"$")
	public void i_enter_Place_as(String arg1) throws Throwable{
    	objAccomodationPage.txtBoxPlace.sendKeys(arg1);
    	
	}
   
    @And("^I select from Date as \"([^\"]*)\"$")
   	public void i_select_from_Date_as(String arg1) throws Throwable{
       	objAccomodationPage.linkCalander.click();
    	objAccomodationPage.datePicker(Integer.parseInt(arg1));
    	
   	}
    
    @And("^I select to Date as \"([^\"]*)\"$")
   	public void i_select_to_Date_as(String arg1) throws Throwable{
    	objAccomodationPage.datePicker(Integer.parseInt(arg1));
    	
   	}
    
    @And("^I click on Search$")
	public void i_click_on_Search() throws Throwable{
		objAccomodationPage.btnSearch.click();
		
	}
    
    @Then("^I should see List is accomations available for given locations$")
   	public void I_should_see_List_is_accomations_available_for_given_locations() throws Throwable{
    	int listOfHotels = objAccomodationPage.fetchHotelList();
		System.out.println(listOfHotels);
		Assert.assertTrue(listOfHotels>0, "Accomodations availability");
		
}
}
