
Feature: Search Car Rentals
  As a user 
  I want to search whether acomodations are available 
  Inorder to see the list

Background: User navigates to the applications
Given I am on Main of Booking URL "https://www.booking.com"
Then I should see Car Rentals

  @scenario3
  Scenario: Search list of Car Rentals
    When I click on car rentals link
    And I click on return to same location radio button
    And I enter pick up from as "Dubai Airport T3"
    And I select date from as "3"
    And I select check in time as "10"
    And I select check in time minutes as "15"
    And I select check out time as "15"
    And I select check out time minutes as "30"
    And I select date To as "4"
    And I click on search in car rentals page
    Then I should see List of car rentals available for given locations with rating as "Excellent"
 
