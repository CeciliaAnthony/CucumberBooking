#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search Accomodations
  As a user 
  I want to search whether acomodations are available 
  Inorder to see the list

Background: User navigates to the applications
Given I am on HomePage of Booking URL "https://www.booking.com"
Then I should see Home Page

  @scenario1
  Scenario: Search list of Accomodations
    When I click on Accomodations link
    And I enter Place as "Dubai"
    And I select from Date as "0"
    And I select to Date as "3"
    And I click on Search
    Then I should see List is accomations available for given locations
 
