
Feature: Search AirportTaxis
  As a user 
  I want to search whether acomodations are available 
  Inorder to see the list

Background: User navigates to the applications
Given I am on Default of Booking URL "https://www.booking.com"
Then I should see Airport Taxis

  @scenario2
  Scenario: Search list of Airport Taxis
    When I click on airport taxis link
    And I click on oneway radio button
    And I enter pickUpLocation as "Dubai International Airport"
    And I enter dropOffLocation as "Hotel Fairmont The Palm"
    And I select date as "3"
    And I select pickUp hour as "09"
    And I select pickUp minute as "30"
    And I select passengers as "2"
    And I click on Search in Airport Taxis Page
    Then I should see List of airport taxis available for given locations
 
